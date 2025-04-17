package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows

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
        val invalidInputs = listOf("", " ", "a", "race", "  b  ", "3333333333", "3.14")
        invalidInputs.forEach { input ->
            val exception = assertThrows<IllegalArgumentException> { InputView.convertRoundCount(input) }
            assertEquals(
                "The number of rounds should be a number.",
                exception.message
            )
        }
    }

    @Test
    fun `throw exception if the number of rounds is less than or equal to 0`() {
        val invalidNumbers = listOf(0, -1, -2147483648)
        invalidNumbers.forEach { number ->
            val exception = assertThrows<IllegalArgumentException> { InputView.validateRoundCount(number) }
            assertEquals(
                "The number of rounds must be a number greater than or equal to 1.",
                exception.message
            )
        }
    }

    @Test
    fun `pass with the valid number of rounds`() {
        val inputs = listOf("1", "12", "  3", "4  ", "  5  ", "01", "0012", "2147483647")
        inputs.forEach { input ->
            val count = InputView.convertRoundCount(input.trim())
            InputView.validateRoundCount(count)
        }
    }
}