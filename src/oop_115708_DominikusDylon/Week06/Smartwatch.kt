package oop_115708_DominikusDylon.Week06

class Smartwatch : Watch(), bluetoothConnectable, Rechargeable {
    override fun showTime(){
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing ...")
    }

    override fun chargeBattery(){
        println("Mengisi daya menggunakan charger magnetik 15W")
    }
}