package racingcar

import camp.nextstep.edu.missionutils.Console

fun main() {
    val carNames = readCarNames()
    val cars = carNames.map { name ->
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

// TODO: Find better way to extract the function into new location other than Application.kt file
fun readCarNames(): List<String> {
    println("Enter the names of the cars (comma-separated):")
    val userInput = Console.readLine()

    // Should I throw error on blank?
    // TODO: Separate parsing
    val carNames = userInput.split(",")
        .map { it.trim() }
        .filter { it.isNotEmpty() }
        .filter { it.isNotBlank() }
    return carNames
}