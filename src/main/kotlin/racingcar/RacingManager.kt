package racingcar

class RacingManager(val cars: List<Car>, val roundCount: Int) {
    private val carCount = cars.size
    private val generator = RandomValueGenerator
    private var currentRound = 0

    fun getCurrentRound(): Int = currentRound

    fun goNextRound() { currentRound++ }

    fun moveAllCars() {
        cars.forEach { car ->
            car.moveForward(generator.generateNumber())
        }
    }

    fun findWinners(): List<Car> {
        val scoreBoard = cars.map { it.position }
        val winnerPosition = scoreBoard.maxOrNull()
        return cars.filter { it.position == winnerPosition }
    }

}