package baseball

fun main() {
    while (true) {
        // 1. init and start game
        val gameMaster = GameMaster()
        val targetNumbers = gameMaster.targetNumbers
        println("숫자 야구 게임을 시작합니다.")

        while (!gameMaster.isMatch) {
            // 2. take user input
            val numbersFromUser = InputView.readUserNumbers()

            // 3. match numbers
            val matchResult = gameMaster.matchNumbers(targetNumbers, numbersFromUser)
            println(matchResult)
        }

        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
        // 4. process restart or exit
        val willExit = InputView.readUserExitOrNot()
        if (willExit)
            return
    }
}
