package oop_115708_DominikusDylon.Week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Damage tidak boleh negatif!")
                return
            }
            field = if (value > 1000) 1000 else value
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}