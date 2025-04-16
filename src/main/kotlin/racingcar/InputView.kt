package racingcar

import camp.nextstep.edu.missionutils.Console

object InputView {
    fun readCarNames(): List<String> {
        println("Enter the names of the cars (comma-separated):")
        val userInput = Console.readLine()
        return parseCarNames(userInput)
    }

    // Checkpoint: Should I throw error on blank?
    fun parseCarNames(input: String): List<String> {
        return input.split(",")
            .map { it.trim() }
            .filter { it.isNotEmpty() }
            .filter { it.isNotBlank() }
    }
}