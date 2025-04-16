package racingcar

fun main() {
    val carNames = InputView.readCarNames()
    val cars = carNames.map { name ->
        Car(name)
    }

    println("Car list:")
    cars.forEach { println("${it.name} ${it.position}")}

    return
}
