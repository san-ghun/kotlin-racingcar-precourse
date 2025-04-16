package racingcar

fun main() {
    val carNames = InputView.readCarNames()
    val cars = carNames.map { name ->
        // TODO: Delegate name.length validation to Car() class's initializer
        if (name.length > 5) {
            throw IllegalArgumentException("Car names max 5 characters: $name")
        } else {
            Car(name)
        }
    }

    println("Car list:")
    cars.forEach { println("${it.name} ${it.position}")}

    return
}
