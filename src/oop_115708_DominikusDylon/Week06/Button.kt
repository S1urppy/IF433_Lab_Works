package oop_115708_DominikusDylon.Week06

class Button (override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasill di klik !!!")
    }
}