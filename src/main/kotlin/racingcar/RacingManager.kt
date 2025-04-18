package racingcar

class RacingManager(val cars: List<Car>, val roundCount: Int) {
    private val generator = RandomValueGenerator
    val currentRound: Int
        get() = _currentRound

    private var _currentRound = 0

    fun goNextRound() { _currentRound++ }

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