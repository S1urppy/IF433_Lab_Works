package oop_115708_DominikusDylon.week07

object GameManager {
    var isGameRunning: Boolean = false
    fun startGame(){
        if (isGameRunning == true) {
            println("Game sudah berjalan! Mencegah instansiasi ganda")
        } else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}