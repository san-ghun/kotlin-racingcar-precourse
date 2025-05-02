package racingcar

data class Car(private val carName: String) {

    private var _progress = 0
    val progress: Int
        get() = _progress

    init {
        require(carName.isNotBlank()) {
            "Car name must not empty or blank."
        }
        require(carName.length in 1..5) {
            "Car name must be in range of 1 to 5."
        }
    }

    fun getName(): String = carName

    fun move(generatedNumber: Int) {
        if (generatedNumber >= 4)
            moveForward()
    }

    private fun moveForward() {
        _progress++
    }

    fun displayProgress(): String {
        return "-".repeat(progress)
    }
}
