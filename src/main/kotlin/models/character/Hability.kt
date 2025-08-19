package models.character

data class Hability(
    val habilityName: String,
    val description: String,
    val modType: ModType,
    val modStat: String,
    val modAmmount: Byte
)