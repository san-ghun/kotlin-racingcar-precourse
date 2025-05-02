package racingcar

import camp.nextstep.edu.missionutils.Console

object InputView {
    fun readCarNames(): List<String> {
        // 1. take user input car names
        val userInput = Console.readLine().trim()
        // validate input
        val carNames = userInput
            // comma-separation
            .split(",")
        if (carNames.isEmpty()) {
            throw IllegalArgumentException("Invalid input - names empty")
        }
        // less than 5 char, inclusive
        carNames.forEach { name ->
            if (name.isBlank()) throw IllegalArgumentException("Invalid input - name blank")
            if (name.length > 5) throw IllegalArgumentException("Invalid input - name exceed 5 chars")
        }
        return carNames
    }

    fun readNumberOfRounds(): Int {
        val userInput = Console.readLine().trim()
        val numberOfRounds = userInput
            // validate input
            // type integer
            .toIntOrNull() ?: throw IllegalArgumentException("Invalid input - null in number of rounds")
        if (numberOfRounds == 0) throw IllegalArgumentException("Invalid input - number of rounds should be bigger than 0")
        return numberOfRounds
    }
}