package racingcar

class RacingManager(val cars: List<Car>, val roundCount: Int) {
    private val carCount = cars.size
    private val generator = RandomValueGenerator
    private var currentRound = 0

    fun getCurrentRound(): Int = currentRound

    fun goNextRound() { currentRound++ }

    fun moveAllCars() {
        // iterate list of Car()

            // car.moveForward() with random value as argument
            // and update car's position
    }

    fun findWinners(): List<Car> {
        // make list of position of car

        // find max position value from the list

        // filter 'cars' with max position value

        // return the filtered list of car
        return TODO("filtered list of car")
    }

}