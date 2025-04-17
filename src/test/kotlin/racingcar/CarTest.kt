package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows

class CarTest {
    @Test
    fun `create Car instance with a name and position 0`() {
        val car = Car("pobi")

        assertThat(car.name).isEqualTo("pobi")
        assertThat(car.getPosition()).isEqualTo(0)
    }

    @Test
    fun `can create when car name has 1 to 5 characters`() {
        val names = listOf("a", "abc", "pobi", "wonis")
        names.forEach { name ->
            Car(name)
        }
    }

    @Test
    fun `throw exception when car name is empty or more than 6 characters`() {
        val invalidNames = listOf("", "wonjun", "     ")

        invalidNames.forEach { name ->
            val exception = assertThrows<IllegalArgumentException> { Car(name.trim()) }
            assertEquals(
                "The car name must be at least 1 character and no more than 5 characters. Input value: '${name.trim()}'",
                exception.message
            )
        }
    }

    @Test
    fun `car moveForward test`() {
        val values = listOf(4, 5, 6, 7, 8, 9)

        values.forEach { value ->
            val testCar = Car("test")
            testCar.moveForward(value)
            assertEquals(1, testCar.getPosition())
        }
    }

    @Test
    fun `car do not moveForward test`() {
        val values = listOf(0, 1, 2, 3)

        values.forEach { value ->
            val testCar = Car("test")
            testCar.moveForward(value)
            assertEquals(0, testCar.getPosition())
        }
    }
}