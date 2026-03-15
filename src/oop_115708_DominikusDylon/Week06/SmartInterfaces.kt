package oop_115708_DominikusDylon.Week06

interface smartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn()

    fun turnOff()
}

interface Recordable {
    fun startRecord()

    fun stopRecord(){
        println("Perekaman dihentikan dan disimpan ke cloud")
    }
}