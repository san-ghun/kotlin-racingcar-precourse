package baseball

class GameMaster(private val provider: NumbersGenerator = RandomNumbersGenerator) {

    private var _targetNumbers: List<Int>
    val targetNumbers: List<Int>
        get() = _targetNumbers
    private var _isMatch = false
    val isMatch: Boolean
        get() = _isMatch

    init {
        _targetNumbers = generateNumbers()
    }

    private fun generateNumbers(): List<Int> {
        return provider.generateNumbers()
    }

    fun matchNumbers(target: List<Int>, sample: List<Int>): String {
        var strike = 0
        var ball = 0
        val tempMutableList = mutableListOf<String>()

        for (i in 0..2) {
            val n = sample[i]
            if (n in target) {
                if (n == target[i]) {
                    strike++
                    continue
                }
                ball++
            }
        }

        if (strike == 3) {
            _isMatch = true
            return "3스트라이크"
        }
        if (strike + ball == 0)
            return "낫싱"
        if (ball > 0)
            tempMutableList.add("${ball}볼")
        if (strike > 0)
            tempMutableList.add("${strike}스트라이크")

        return tempMutableList.joinToString(" ")
    }
}