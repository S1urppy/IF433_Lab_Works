package oop_115708_DominikusDylon.week07

enum class ItemRarity (val dropChance: Int){
    COMMON(100),
    UNCOMMON(50),
    RARE(20),
    EPIC(7),
    LEGENDARY(1)
}

sealed class GameItem{
    data class gameItem(
        val name: String,
        val damage: Int,
        val rarity: ItemRarity
    )
}