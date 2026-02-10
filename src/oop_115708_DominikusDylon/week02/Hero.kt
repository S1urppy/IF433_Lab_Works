package oop_115708_DominikusDylon.week02

import oop_115708_DominikusDylon.week02.Student

class Hero (var name: String, var hp: Int = 100, var baseDamage: Int){
    fun attack(targetName: String) {
        println("$name menebas $targetName !")
    }

    fun takeDamage(damage: Int) {
        hp = hp - damage

        if(hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean{
        if(hp > 0){
            return true
        }else{
            return false
        }
    }

}