package models.character.race

import models.character.hability.Hability

data class Race(
    val raceName: String,
    val infravision: Byte?,
    val movement: Byte,
    val racialHability: List<Hability> = listOf<Hability>()
)