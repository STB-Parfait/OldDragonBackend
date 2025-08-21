package models.character

import models.character.race.Race
import models.items.Item
import kotlin.math.floor

open class Character {

    var name: String
    var level: Byte
    //HP deve depender da classe selecionada e deve ser do tipo Byte
    var xp: Int
    var race: Race?
    var skills: LinkedHashMap<String, Byte>
    var skillMod: LinkedHashMap<String, Byte>
    var inventory: MutableList<Item>
    var atributes: LinkedHashMap<String, Byte>
    var equippedItems: LinkedHashMap<String, Item?>

    constructor(){
        name = ""

        level = 1

        xp = 0

        race = null

        skills = linkedMapOf()
        skills["str"] = 1
        skills["dex"] = 1
        skills["con"] = 1
        skills["int"] = 1
        skills["wis"] = 1
        skills["cha"] = 1

        skillMod = linkedMapOf()
        for(skill in skills) {
            when{
                skill.value <1 -> error("${skill.key} should not be less than 1")
                skill.value in 9..12 -> skillMod[skill.key] = 0
                skill.value >12 -> skillMod[skill.key] = floor((skill.value.toDouble()-10)/2).toInt().toByte()
                skill.value <9 -> skillMod[skill.key] = floor((skill.value.toDouble()-10)/2).toInt().toByte()
            }
        }

        atributes = linkedMapOf()
        atributes["ca"] = 0
        atributes["ba"] = 0
        atributes["jp"] = 0

        inventory = mutableListOf()

        equippedItems = linkedMapOf()
        equippedItems["leftHand"] = null
        equippedItems["rightHand"] = null
        equippedItems["body"] = null

    }
}