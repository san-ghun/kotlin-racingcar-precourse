package racingcar

import camp.nextstep.edu.missionutils.Randoms

interface NumberGenerator {
    fun generateNumber(): Int
}

object RandomNumberGenerator : NumberGenerator {
    override fun generateNumber(): Int {
        return Randoms.pickNumberInRange(0, 9)
    }
}