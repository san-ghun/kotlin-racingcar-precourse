package racingcar

object OutputView {
    fun showRoundResult(cars: List<Car>) {
        cars.forEach { car ->
            println("${car.getName()} : ${car.displayProgress()}")
        }
    }

    fun showWinners(winners: List<Car>) {
        val winnerNames = winners.map { it.getName() }
        val displayNames = winnerNames.joinToString(",")
        println("Winners : $displayNames")
    }
}