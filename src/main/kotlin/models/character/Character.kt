package models.character

import models.items.Item
import kotlin.math.floor

open class Character {

    var name: String
    var level: Int
    var hp: Int
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

        hp = 100
        xp = 0

        race = null

        skills = linkedMapOf()
        skills["str"] = 0
        skills["dex"] = 0
        skills["con"] = 0
        skills["int"] = 0
        skills["wis"] = 0
        skills["cha"] = 0

        skillMod = linkedMapOf()
        for(skill in skills) {
            when{
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