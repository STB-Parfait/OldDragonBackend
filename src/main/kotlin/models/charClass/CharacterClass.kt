package models.charClass

import models.dice.Dice

abstract class CharacterClass(
    val className: String,
    val hitDie: Int,
    val primaryAttribute: String,
    val allowedArmor: List<String>,
    val allowedWeapons: List<String>
) : icharClass {
    
    protected val dice = Dice()
    
    fun calculateHitPoints(level: Byte, constitution: Byte): Byte {
        var totalHP = 0
        val conModifier = when {
            constitution < 9 -> -1
            constitution > 12 -> (constitution - 10) / 2
            else -> 0
        }
        
        // Primeiro nível sempre usa o máximo do dado
        totalHP += hitDie + conModifier
        
        // Níveis subsequentes rolam o dado
        for (i in 2..level) {
            totalHP += dice.roll(hitDie) + conModifier
        }
        
        return maxOf(1, totalHP).toByte()
    }
    
    abstract fun getClassFeatures(level: Byte): List<String>
    abstract fun canUseSpells(): Boolean
    abstract fun getSpellsPerDay(level: Byte): Map<Int, Int>
}