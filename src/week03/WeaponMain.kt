package week03

fun main() {

    val weapon = Weapon("Excalibur")

    weapon.damage = -50
    weapon.damage = 9999

    println("Tier senjata: ${weapon.tier}")
}