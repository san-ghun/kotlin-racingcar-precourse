package racingcar

fun main() {
    val carNames = InputView.readCarNames()
    val cars = carNames.map { name ->
        Car(name)
    }

    val roundCount = InputView.readRoundCount()

    // Create and initialize an object 'RacingManager'
    val manager = RacingManager(cars, roundCount)

    // Start game
    println()

    // Iterate through rounds
    while (manager.isRacing()) {

        // Move all cars
        manager.moveAllCars()

        // Show the result of round
        //ResultView.printRace(cars)
        cars.forEach { car ->
            println("${car.name} : ${car.drawPosition()}")
        }
        println()

        // Go next round
        manager.goNextRound()
    }

    // Show winner(s)
    val winners = manager.findWinners()
    //ResultView.printWinners(winners)
    println("Winners : ${winners.joinToString { it.name }}")

    return
}
