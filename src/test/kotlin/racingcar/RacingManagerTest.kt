package racingcar

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class RacingManagerTest {
    @Test
    fun `create RacingManager instance with arguments`() {
        val testCars = listOf(Car("a"), Car("b"))
        val testRoundCount = 3
        val manager = RacingManager(testCars, testRoundCount)

        assertEquals(testCars, manager.cars)
        assertEquals(testRoundCount, manager.roundCount)
        assertEquals(1, manager.currentRound)
    }

    @Test
    fun `goNextRound() test`() {
        val testCars = listOf(Car("a"), Car("b"))
        val testRoundCount = 3
        val manager = RacingManager(testCars, testRoundCount)

        manager.goNextRound()
        assertEquals(2, manager.currentRound)
    }

    @Test
    fun `isRacing() test`() {
        val testCars = listOf(Car("a"), Car("b"))
        val testRoundCount = 3
        val manager = RacingManager(testCars, testRoundCount)

        assertEquals(true, manager.isRacing())
        repeat(3) { manager.goNextRound() }
        assertEquals(false, manager.isRacing())
    }

    @Test
    fun `moveAllCars() move all car test`() {
        val testCars = listOf(Car("a"), Car("b"))
        val testRoundCount = 3
        val manager = RacingManager(
            testCars,
            testRoundCount,
            TestMoveValueGenerator
        )

        manager.moveAllCars()
        val expected = (1..2).map { 1 }
        val testResult = testCars.map { it.position }
        assertEquals(expected, testResult)
    }

    @Test
    fun `moveAllCars() move no car test`() {
        val testCars = listOf(Car("a"), Car("b"))
        val testRoundCount = 3
        val manager = RacingManager(
            testCars,
            testRoundCount,
            TestDoNotMoveValueGenerator
        )

        manager.moveAllCars()
        val expected = (1..2).map { 0 }
        val testResult = testCars.map { it.position }
        assertEquals(expected, testResult)
    }

    @Test
    fun `findWinner() test`() {
        val testCars = listOf(Car("a"), Car("b"))
        val testRoundCount = 3
        val manager = RacingManager(
            testCars,
            testRoundCount,
            TestDoNotMoveValueGenerator
        )

        manager.cars[0].moveForward(0)
        manager.cars[1].moveForward(9)
        val expected = testCars.subList(1, 2)
        val testResult = manager.findWinners()
        assertEquals(expected, testResult)
    }
}