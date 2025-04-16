package racingcar

import camp.nextstep.edu.missionutils.Console

fun main() {
    
    println("Enter the names of the cars (comma-separated):")
    val readLine = Console.readLine()

    var carNames = readLine.split(",")

    carNames = carNames.filter { it.isNotEmpty() }.filter { it.isNotBlank() }

    val cars = carNames.map { name ->
        Car(name)
    }

    return
}
