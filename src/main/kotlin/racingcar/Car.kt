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

    fun name(): String = carName

    fun move() {
        TODO("implement with random number generator")
    }

    private fun moveForward() {
        _progress++
    }

    fun displayProgress(): String {
        return "-".repeat(progress)
    }
}
