package racingcar

fun main() {
    val carNames = InputView.readCarNames()
    val cars = carNames.map { name ->
        Car(name)
    }

    val roundCount = InputView.readRoundCount()

    println("Car list:")
    cars.forEach { println("${it.name} ${it.getPosition()}")}
    println("Round count: $roundCount")

    // Create and initialize an object 'RacingManager'
    //val manager = RacingManager()

    // Start game
    //manager.goNextRound()

    // Iterate through rounds
    //while (manager.getCurrentRound() <= roundCount) {}

        // Move all cars
        //manager.moveAllCars()

        // Show the result of round
        //ResultView.printRace(cars)

        // Go next round
        //manager.goNextRound()

    // Show winner(s)
    //val winners = manager.findWinners()
    //ResultView.printWinners(winners)

    return
}
