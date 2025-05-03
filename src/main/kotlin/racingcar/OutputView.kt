package racingcar

object OutputView {
    fun showRoundResult(cars: List<Car>) {
        cars.forEach { car ->
            println("${car.getName()} : ${car.displayProgress()}")
        }
    }

    fun showWinners(winners: List<Car>) {

    }
}