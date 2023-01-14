package mk.sekuloski.lab_intents.data

fun movieList(): MutableList<Movie> {
    return mutableListOf(
        Movie(1, "John Wick", "John Wick, a retired hitman, is forced to return to his old ways after a group of Russian gangsters steal his car and kill a puppy gifted to him by his late wife.",
            "Chad Stahelski", arrayOf("Keanu Reaves", "Lawrence Fishburne")),
        Movie(2, "John Wick 2", "Renowned assassin John Wick sets out for Rome to duel with some of the deadliest killers to fulfil a vow he made. However, he soon learns that there is a huge bounty on his head.",
            "Chad Stahelski", arrayOf("Keanu Reaves", "Lawrence Fishburne")),
        Movie(3, "John Wick 3", "John Wick is declared excommunicado and a hefty bounty is set on him after he murders an international crime lord. He sets out to seek help to save himself from ruthless hitmen and bounty hunters.",
            "Chad Stahelski", arrayOf("Keanu Reaves", "Lawrence Fishburne"))
    )
}