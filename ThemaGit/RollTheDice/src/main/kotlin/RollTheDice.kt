import kotlin.random.Random
import kotlin.random.nextInt

/**
 * Simuliert ein einfaches Würfelspiel zwischen dem
 * Computer und einem Spieler
 *
 * Autor: Andreas Wassmer
 * Version: 20241120
 */



fun main() {

    var playerName = ""
    fun askPlayerName() {
       print("Bitte Name angeben: ")
        playerName = readln()
    }

askPlayerName()

    val die = Random

    val playerScore = die.nextInt(1..6)
    val computerScore = die.nextInt(1..6)

    // Todo: Den Fehler im Programm finden und beheben
    // Todo: Den Spieler nach dem Namen fragen
    // Todo: Solange spielen bis Spieler abbricht
    // Todo: Ausgeben, wer mehr Runden gewonnen hat

    println("$playerName würfelt: $playerScore  --  Computer würfelt: $computerScore")
    when {
        playerScore > computerScore -> println("$playerName gewinnt")
        playerScore < computerScore -> println("Der Computer gewinnt")
        else -> println("Unentschieden")
    }
}