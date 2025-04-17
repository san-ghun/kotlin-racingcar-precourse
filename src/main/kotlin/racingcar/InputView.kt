package racingcar

import camp.nextstep.edu.missionutils.Console

object InputView {
    fun readCarNames(): List<String> {
        println("Enter the names of the cars (comma-separated):")
        val userInput = Console.readLine()
        return parseCarNames(userInput)
    }

    fun parseCarNames(input: String): List<String> {
        return input.split(",")
            .map { it.trim() }
            .filter { it.isNotEmpty() }
            .filter { it.isNotBlank() }
    }

    fun readRoundCount(): Int {
        println("How many rounds will be played?")
        val userInput = Console.readLine()
        val count =
            userInput.toIntOrNull() ?: throw IllegalArgumentException("The number of rounds should be a number.")
        if (count <= 0) {
            throw IllegalArgumentException("The number of rounds must be a number greater than or equal to 1.")
        }
        return count
    }
}