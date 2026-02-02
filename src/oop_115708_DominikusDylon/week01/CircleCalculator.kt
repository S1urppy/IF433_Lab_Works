package oop_115708_DominikusDylon.week01

import java.awt.geom.Area

fun main(args: Array<String>){
    var radius = 7.0
    val pi = 3.14

    var area = pi * radius * radius
    println("Radius: ${radius}, Area: ${area}")
    checkSize(area)
}

fun checkSize(area : Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}