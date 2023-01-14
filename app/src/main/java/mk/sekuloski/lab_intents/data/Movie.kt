package mk.sekuloski.lab_intents.data

data class Movie (
    val id: Long,
    val name: String,
    val description: String,
    val director: String,
    val actors: Array<String>
)
