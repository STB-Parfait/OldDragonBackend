package models.character

object Races {
    val human = Race(
        raceName = "Human",
        infravision = null,
        movement = 9,
        racialHability = listOf(
            RacialHabilities.rowdy,
            RacialHabilities.curiosity
        )
    )
    val elf = Race(
        raceName = "Elf",
        infravision = 18,
        movement = 9,
        racialHability = listOf(
            RacialHabilities.agility,
            RacialHabilities.longLives
        )
    )
    val dwarf = Race(
        raceName = "Dwarf",
        infravision = 18,
        movement = 6,
        racialHability = listOf(
            RacialHabilities.hardShell,
            RacialHabilities.pubBrother
        )
    )

    private val raceRegistry = mapOf(
        "human" to human,
        "elf" to elf,
        "dwarf" to dwarf,
    )

    fun findByName(name: String): Race? = raceRegistry[name.lowercase()]

    fun listAll(): List<Race> = raceRegistry.values.toList()
}