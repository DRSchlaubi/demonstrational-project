sealed interface Interface {
    val shit: String
}

data class Shit2(override val shit: String) : Interface
