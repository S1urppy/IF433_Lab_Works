package oop_115708_DominikusDylon.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}! Bersiap untuk bertarung!")
        }

        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Mendapatkan Loot: $name (Damage: $damage, Rarity: $rarity)")
        }

        is BattleState.GameOver -> {
            println("Game Over! cause of death: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Berada didalam Safe Zone")
        }
    }
}