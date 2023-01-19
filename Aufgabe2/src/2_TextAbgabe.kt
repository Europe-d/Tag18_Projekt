/*
Schreibe hier deine Antwort auf:
 das komm auf die konsola aus ("Diese Schuhe sind leider ausverkauft")
 */

var numberOfShoes = 0

fun main() {
    try {
        orderShoes()
    } catch (e: Exception) {
        println("Diese Schuhe sind leider ausverkauft")
    }
}

fun orderShoes() {
    println("Es wird Ã¼berprÃ¼ft ob die Schuhe noch vorrÃ¤tig sind...")
    if (numberOfShoes > 0) {
        println("Die Schuhe wurden bestellt")
        numberOfShoes = numberOfShoes - 1
    } else {
        throw Exception("no shoes available")
    }
}