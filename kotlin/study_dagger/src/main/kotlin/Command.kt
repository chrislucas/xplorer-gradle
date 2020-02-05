interface Command {
    fun key(): String
    fun handleInput(vararg args: String): StatusCommand
}
