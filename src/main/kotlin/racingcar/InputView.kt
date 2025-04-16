package racingcar

import camp.nextstep.edu.missionutils.Console

object InputView {
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
}