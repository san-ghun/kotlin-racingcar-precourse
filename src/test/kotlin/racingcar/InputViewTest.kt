package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InputViewTest {
    @Test
    fun `convert a string of car names separated by comma into a list`() {
        val input = "pobi, woni , jun, "
        val result = InputView.parseCarNames(input)

        assertThat(result).containsExactly("pobi", "woni", "jun")
    }

    @Test
    fun `exclude blank or empty names`() {
        val input = "pobi,    woni  , ,   , jun,   , "
        val result = InputView.parseCarNames(input)

        assertThat(result).containsExactly("pobi", "woni", "jun")
    }

    @Test
    fun `throw exception if the number of rounds is not a number`() {

    }

    @Test
    fun `throw exception if the number of rounds is less than or equal to 0`() {

    }

    @Test
    fun `pass with the valid number of rounds`() {

    }
}