package models.character

import models.items.Item

class Character {
    init{
        val name: String = ""

        var level: Int = 1

        var skills: LinkedHashMap<String, Pair<Byte,Byte>> = linkedMapOf()
        skills["str"] = Pair(0,0)
        skills["dex"] = Pair(0,0)
        skills["con"] = Pair(0,0)
        skills["int"] = Pair(0,0)
        skills["wis"] = Pair(0,0)
        skills["cha"] = Pair(0,0)

        var atributes: LinkedHashMap<String, Byte> = linkedMapOf()
        atributes["ca"] = 0
        atributes["ba"] = 0
        atributes["jp"] = 0

        atributes["pv"] = 100
        atributes["xp"] = 0

        var inventory: MutableList<Item> = mutableListOf()

        var equippedItems: LinkedHashMap<String, Item?> = linkedMapOf()
        equippedItems["left_hand"] = null
        equippedItems["right_hand"] = null
        equippedItems["body"] = null

    }
}