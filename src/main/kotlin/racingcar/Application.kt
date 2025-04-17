package racingcar

fun main() {
    val carNames = InputView.readCarNames()
    val cars = carNames.map { name ->
        Car(name)
    }

    // Read round count from user input
    val roundCount = InputView.readRoundCount()

    println("Car list:")
    cars.forEach { println("${it.name} ${it.getPosition()}")}
    println("Round count: $roundCount")

    // Create and initialize an object 'GameMaster'

    // Start game

    // Iterate through rounds

        // Show the result of round

        // Check the round count

    // Show winner(s)

    return
}
