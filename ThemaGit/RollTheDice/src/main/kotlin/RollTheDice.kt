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
var playerCount = 0
var computerCount = 0
var unentschieden = 0

while (true) {
    val die = Random
    val playerScore = die.nextInt(1..6)
    val computerScore = die.nextInt(1..6)

    // Todo: Den Fehler im Programm finden und beheben
    // Todo: Den Spieler nach dem Namen fragen
    // Todo: Solange spielen bis Spieler abbricht
    // Todo: Ausgeben, wer mehr Runden gewonnen hat

    println("$playerName würfelt: $playerScore  --  Computer würfelt: $computerScore")
    when {
        playerScore > computerScore -> {println("$playerName gewinnt")
        playerCount++}
        playerScore < computerScore -> {println("Der Computer gewinnt")
        computerCount++}
        else -> {println("Unentschieden")
        unentschieden++}
    }
    println("Nochmal spielen? (j/n)")
    if (readln() != "j") {
        println("Danke fürs Spiel! ")
        println("")
        println("$playerName hat $playerCount Runden gewonnen")
        println("der Computer hat $computerCount Runden gewonnen")
        println ("und es gab $unentschieden Unentschieden.")
        println("")
        when{
            playerCount > computerCount -> println("$playerName hat öfter gewonnen!")
            playerCount < computerCount -> println("Der Computer hat öfter gewonnen!")
            else -> println("Es gab keinen Gewinner!")
        }
        break}
}
}