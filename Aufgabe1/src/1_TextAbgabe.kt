/*
Schreibe hier deine Antwort auf:mit anfang meine antwort war
println("Es sind leider nicht mehr genug SitzplÃ¤tze verfÃ¼gbar.") aber sind 2 auf die konsola
sie haben 8 geschrieben und komm nicht weil nur 6 sind
aber ich habe adere nummer geschrieben und es ist ja
 */


var availableSeats = 6

fun main() {
    try {
        reserveSeats(4)
    } catch (e: Exception) {
        println("Es sind leider nicht mehr genug SitzplÃ¤tze verfÃ¼gbar.")
    }
}

fun reserveSeats(numberOfSeats: Int) {
    println("Es wird Ã¼berprÃ¼ft, ob noch " + numberOfSeats + " SitzeplÃ¤tze verfÃ¼gbar sind...")
    if (numberOfSeats > availableSeats) {
        throw Exception("not enough available seats left")
    } else {
        availableSeats = availableSeats - numberOfSeats
        println("Die SitzplÃ¤tze wurden erfolgreich gebucht!")
    }
}