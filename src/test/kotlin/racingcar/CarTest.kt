package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows

class CarTest {
    @Test
    fun `create Car instance with a name and position 0`() {
        val car = Car("pobi")

        assertThat(car.name).isEqualTo("pobi")
        assertThat(car.position).isEqualTo(0)
    }

    @Test
    fun `can create when car name has 1 to 5 characters`() {
        val names = listOf("a", "abc", "pobi", "wonis")
        names.forEach { name ->
            Car(name)
        }
    }

    @Test
    fun `throw exception when car name is empty or more than 6 characters`() {
        val invalidNames = listOf("", "wonjun", "     ")

        invalidNames.forEach { name ->
            val exception = assertThrows<IllegalArgumentException> { Car(name.trim()) }
            assertEquals(
                "The car name must be at least 1 character and no more than 5 characters. Input value: '${name.trim()}'",
                exception.message
            )
        }
    }
}