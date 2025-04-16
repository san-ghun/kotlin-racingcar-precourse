package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun `create Car instance with a name and position 0`() {
        val car = Car("pobi")

        assertThat(car.name).isEqualTo("pobi")
        assertThat(car.position).isEqualTo(0)
    }

    @Test
    fun `can create when car name has 1 to 5 characters`() {
    }

    @Test
    fun `throw exception when car name is empty or more than 6 characters`() {
    }
}