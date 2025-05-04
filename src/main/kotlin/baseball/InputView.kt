package baseball

import camp.nextstep.edu.missionutils.Console

object InputView {

    fun readUserNumbers(): List<Int> {
        print("숫자를 입력해주세요 : ")
        val userInput = Console.readLine().trim()
        require(userInput.isNotBlank()) { "Invalid input" }
        require(userInput.length == 3) { "Invalid input" }
        val numbers = userInput.map { digit ->
            digit.digitToIntOrNull() ?: throw IllegalArgumentException("Invalid digit")
        }
        require(numbers.distinct().size == 3) { "Duplicates" }
        return numbers
    }

    fun readUserExitOrNot(): Boolean {
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        val userInput = Console.readLine().trim()
        return when(userInput) {
            "1" -> false
            "2" -> true
            else -> throw IllegalArgumentException("Invalid input")
        }
    }
}