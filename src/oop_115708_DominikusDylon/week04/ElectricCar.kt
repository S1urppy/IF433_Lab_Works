package oop_115708_DominikusDylon.week04

open class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {

    final override fun accelerate(){
        speed += 10
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai : $batteryCapacity%")
    }
}