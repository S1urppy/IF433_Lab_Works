package week03

class Employee(val name: String){
    set(value) {
        println("mencoba set gaji ke: $value")
        this.salary = value
    }
}