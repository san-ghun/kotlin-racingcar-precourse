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
}