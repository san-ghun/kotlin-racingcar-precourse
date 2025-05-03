package racingcar

fun main() {
    println("Enter the names of the cars (comma-separated):")
    // 1. take user input car names
    val carNames = InputView.readCarNames()

    println("How many rounds will be played?")
    // 2. take user input number of rounds
    val numberOfRounds = InputView.readNumberOfRounds()

    // 3. initiate racing master
    // initialize Cars
    val cars = carNames.map { name ->
        Car(name)
    }
    val racingMaster = RacingMaster.createRacingMaster(cars, numberOfRounds)

    // 4. display start of game
    println("\nRace Results")

    // 5. start racing
    // iterate or repeat number of rounds
    repeat(racingMaster.getNumberOfRounds()) {
    // car progress based on the rand-gen number
        racingMaster.raceRound()
    // display result of the round
        OutputView.showRoundResult(racingMaster.getCars())
        println()
    }

    // 6. determine winners
    val winners = racingMaster.getWinners()

    // 7. display winners
    // comma-separation
    OutputView.showWinners(winners)
}
