package oop_115708_DominikusDylon.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myElectricCar = ElectricCar("Ioniq", 4, 100)
    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()
}