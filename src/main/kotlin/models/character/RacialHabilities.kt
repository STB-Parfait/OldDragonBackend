package models.character

object RacialHabilities {
    val rebeldes = Hability(
        "Rebeldia",
        "Humanos nunca estão satisfeitos com o estado das coisas, " +
                "sua rebeldia natural os fazem notórios encrenqueiros. " +
                "<+2 em BA>",
        ModType.ATRIBUTE,
        "ba",
        2
    )
    val curiosos = Hability(
        "Curiosidade",
        "A curiosidade humana fez com que eles, " +
                "mesmo não tendo uma origem tão bela, " +
                "ainda sim possam prosperar nesta terra." +
                "<+1 int mod>",
        ModType.SKILL,
        "int",
        1
    )

}