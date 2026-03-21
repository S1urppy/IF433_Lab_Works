package oop_115708_DominikusDylon.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem(
                name = "Pedang kayu bapuk",
                damage = 5,
                rarity = ItemRarity.COMMON
            )
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon{
            val epicItem = GameItem(
                name = "Katana",
                damage = 80,
                rarity = ItemRarity.EPIC
            )
            return Weapon(epicItem, 250)
        }
    }
}