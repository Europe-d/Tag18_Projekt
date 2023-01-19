fun main() {


    var antwort: Int = readln().toInt()
    var numbers: List<Int> = listOf(1, 2, 3, 4)
    var number: Int = -1
    try {
        number = numbers[antwort]
    } catch (ex: Exception) {
        ex.message
        println("Die Liste hat $numbers mit $antwort gibt nicht")

    }


}



