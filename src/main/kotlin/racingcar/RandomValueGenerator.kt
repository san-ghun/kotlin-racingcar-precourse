package racingcar

import camp.nextstep.edu.missionutils.Randoms

object RandomValueGenerator {
    fun generateNumber(): Int = Randoms.pickNumberInRange(0, 9)
}