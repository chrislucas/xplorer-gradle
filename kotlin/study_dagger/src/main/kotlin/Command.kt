
/**
 * Logica de processamento de insercao de dados pelo usuario
 * */
interface Command {
    // token de autenticacao de comandos
    fun key(): String
    // processador de comands e execucao de alguma acao atrela-da a eles
    fun handleInput(vararg args: String): StatusCommand
}