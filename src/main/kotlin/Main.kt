import utils.readIntNotNull
import java.lang.System.exit
import io.github.oshai.kotlinlogging.KotlinLogging


fun mainMenu(): Int {
    print(""" 
         > ----------------------------------
         > |        NOTE KEEPER APP         |
         > ----------------------------------
         > | NOTE MENU                      |
         > |   1) Add a note                |
         > |   2) List all notes            |
         > |   3) Update a note             |
         > |   4) Delete a note             |
         > ----------------------------------
         > |   0) Exit                      |
         > ----------------------------------
         > ==>> """.trimMargin(">"))
    return readIntNotNull()
}


fun runMenu(){
    do {
        val option = mainMenu()
        when (option){
            1 -> addNote()
            2 -> listNotes()
            3 -> updateNote()
            4 -> deleteNote()
            0 -> exitApp()
            else -> println("Invalid option entered: $option")
        }
    }while (true)
}

fun exitApp() {
    println("exit")
    exit(0)
}

fun deleteNote() {
    println("delete")
}

fun updateNote() {
    println("update")
}

fun listNotes() {
    println("list")
}

fun addNote() {
    println("add")
    logger.info{"addNote() function invoked"}
}

private val logger = KotlinLogging.logger {}

fun main(){
    runMenu()
}
