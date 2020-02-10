import javax.inject.Inject

/**
 * Uma rota/ponto por onde passam os comandos realizados pelo usuairo.
 *
 * */

class CommandRouter @Inject constructor() {

    private val commands : Map<String, Command> = mapOf()

    private fun invalidCommand(input: String) : StatusCommand {
        println("[$input] is a Invalid Command")
        return StatusCommand.INVALID
    }

    fun route(input: String, delimiter : String = " ") : StatusCommand {
        return if (input.isEmpty()) {
            invalidCommand("IsEmpty")
        } else {
            val splitInput = input.split(delimiter)
            val key = splitInput[0]
            commands[key]?.let {
                val status = it.handleInput(*splitInput.subList(1, splitInput.size).toTypedArray())
                if (status == StatusCommand.INVALID) {
                    println("$key is a invalid argument")
                }
                status
            } ?: invalidCommand(key)
        }
    }
}