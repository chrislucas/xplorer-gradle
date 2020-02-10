

fun main() {

    while (true) {
        val statusCommand = readLine()?.let { input ->
            val commandRouter = CommandRouter()

            commandRouter.route(input)
        }
        if (statusCommand == StatusCommand.INVALID)
            break
    }

    println("Finish")
}