package racingcar

class RacingMaster(
    private val cars: List<Car>,
    private val numberOfRounds: Int,
    private val numberGenerator: NumberGenerator = RandomNumberGenerator,
) {
    init {
        require(cars.isNotEmpty()) { "Cars are empty" }
        require(numberOfRounds > 0) { "Number of rounds should be bigger than 0" }
    }

    fun getCars(): List<Car> = cars

    fun getNumberOfRounds(): Int = numberOfRounds

    fun raceRound() {
        cars.forEach { it.move(numberGenerator.generateNumber()) }
    }

    companion object {
        fun createRacingMaster(
            cars: List<Car>,
            numberOfRounds: Int,
        ): RacingMaster {
            return RacingMaster(cars, numberOfRounds)
        }
    }
}