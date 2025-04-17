package racingcar

class Car(val name: String, private var position: Int = 0) {

    init {
        require(name.length in 1..5) {
            "The car name must be at least 1 character and no more than 5 characters. Input value: '$name'"
        }
    }

    fun moveForward(randomValue: Int) {
        if (randomValue >= 4) { position++ }
    }

    fun getPosition(): Int = position
}