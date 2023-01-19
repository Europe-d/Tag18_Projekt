import java.util.Scanner

fun main() {
    println("Bitte gib dein Alter ein:")


    try {  var antwortAlt = readln()

        val alter: Int = antwortAlt.toInt()
        if (alter >= 18) {
            println("Willkommen, hier ist dein Bier, let's party!")
        } else {
            println("Sorry, kein Einlass zur Party. Ist ab 18.")
        }

    } catch (ex:Exception) {
        println("Error: Bitte gib eine gültige Alter ein.")
    }


}




