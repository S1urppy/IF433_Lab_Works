package oop_115708_DominikusDylon.Week06

class SmartLamp(override val id: String, override val name: String) : smartDevice, Switchable {
    override fun turnOn(){
        println("$name dinyalakan")
    }

    override fun turnOff(){
        println("$name dimatikan")
    }
}