package models.character

data class Race(
    val raceName: String,
    val infavision: Byte?,
    val movement: Byte,
    val racialHability: List<Hability> = listOf<Hability>()
) {}