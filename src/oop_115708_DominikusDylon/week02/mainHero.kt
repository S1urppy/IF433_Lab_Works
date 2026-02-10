package oop_115708_DominikusDylon.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("Welcome to SimpleGame")

    print("Masukkan nama: ")
    val name = scanner.nextLine()

    print("Masukkan base damage: ")
    val damage = scanner.nextInt()

    val H1 = Hero(name,100, damage)

    var enemyHp = 100

    while(H1.isAlive() && enemyHp > 0){
        println("1. Serang")
        println("2. Kabur")

        val type = scanner.nextInt()
        scanner.nextLine()

        if(type == 1){
            enemyHp = enemyHp - H1.baseDamage
            println("Sisa HP musuh $enemyHp")
            if(enemyHp > 0){
                H1.takeDamage((10..20).random())
            }
        }else if (type == 2){
            println("2. Kamu kabur")
            break
        }
    }
    if (H1.isAlive()){
        println("kamu menang")
    } else {
        println("kamu kalah")
    }
}