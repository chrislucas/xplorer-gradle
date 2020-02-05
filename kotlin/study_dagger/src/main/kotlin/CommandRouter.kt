
import java.util.*

class CommandRouter {

    companion object {
        val commands : Map<String, Command> = Collections.EMPTY_MAP as Map<String, Command>
    }

    fun route(input: String) : StatusCommand {
        val splitInput = input.split(" ")

        return StatusCommand.HANDLED
    }

}