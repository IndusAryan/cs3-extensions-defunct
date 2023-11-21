// use an integer for version numbers
version = 1

cloudstream {
    // All of these properties are optional, you can safely remove them

    description = "Watch Subbed & Dubbed Anime and Anime Movies"
    authors = listOf("Hexated, AryanInvader")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 2

    tvTypes = listOf(
        "AnimeMovie",
        "Anime",
        "OVA",
        )

    language = "en"

    iconUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvaBBstvo8iS1OljAvUj74hHr8vC73g2BzKAti6kApj9RKJFXX3hQKzprxTtQaIw3gtPA&usqp=CAU"
}
