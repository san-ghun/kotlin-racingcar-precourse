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

    // TODO: Implement how to read round count
    fun readRoundCount(): Int {
        // Display message to user asking for how many rounds
        //println()

        // Take user input
        //val userInput = Console.readLine()

        // Validate the string is a positive number
        //val count = userInput.toIntOrNull() ?: throw

        // If invalid, throw 'IllegalArgumentException'
        //if (count <= 0) {}

        //return count
        return 0
    }
}