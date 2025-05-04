package baseball

import camp.nextstep.edu.missionutils.Randoms

interface NumbersGenerator {
    fun generateNumbers(): List<Int>
}

object RandomNumbersGenerator : NumbersGenerator {
    override fun generateNumbers(): List<Int> {
        val numbers = mutableListOf<Int>()
        while (numbers.size < 3) {
            val randomNumber = Randoms.pickNumberInRange(1, 9)
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber)
            }
        }
        return numbers
    }
}