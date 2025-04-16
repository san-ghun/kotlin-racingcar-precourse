package racingcar

fun main() {
    val carNames = InputView.readCarNames()
    val cars = carNames.map { name ->
        Car(name)
    }

    return
}
