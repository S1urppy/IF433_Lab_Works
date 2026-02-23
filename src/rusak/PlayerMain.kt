package rusak

fun main() {

    val player = Player("Xebec")

    // println(player.xp) ERROR
    player.addXp(50)   // XP = 50 → Level 1
    player.addXp(60)   // XP = 110 → Level Up ke 2

}