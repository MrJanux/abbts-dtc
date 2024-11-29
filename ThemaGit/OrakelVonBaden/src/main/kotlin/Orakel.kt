import kotlin.random.Random

/**
 * Gibt beim Start einen Sinnspruch , ein Glückssymbol und eine Glückszahl
 * aus.
 *
 * Autor: Andreas Wassmer
 * Version: 20241120
 */

// Die Sprüche des Tages
val spells = listOf("Nutze den Tag.", "Heute ist ein toller Tag.", "Du schaffst das.", "Glaube an dich.")
val number = Random.nextInt(1, 100)
// Todo: Hier die Liste mit den Glückssymbolen einfügen
val symbols = listOf("Sonne", "Mond", "Stern", "Herz", "Kleeblatt", "Glückspilz", "Hufeisen", "Schweinchen")

fun main() {
   while (true) {
       val random = Random
       val index = random.nextInt(spells.size)
       println("Dein Leitspruch heute: ${spells[index]}")

       // Todo: Hier das Glückssymbol ausgeben
           println("Dein Glückssymbol heute: ${symbols[index]}")
       // Todo: Hier die Glückszahl berechnen und ausgeben
       println("Deine Glückszahl heute: $number")
       if (number == 69) {
           println("Nice")
       }
       print("Nicht zufrieden? (j/n) ")
       if (readLine() != "j") {
           break
       }
   }
}