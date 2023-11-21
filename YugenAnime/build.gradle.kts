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

    iconUrl = "https://www.google.com/s2/favicons?domain=yugen.to&sz=%size%"
}