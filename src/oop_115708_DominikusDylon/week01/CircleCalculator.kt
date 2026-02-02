package oop_115708_DominikusDylon.week01

import java.awt.geom.Area

fun main(args: Array<String>){
    var radius = 7.0
    val pi = 3.14

    var area = pi * radius * radius
    println("Radius: ${radius}, Area: ${area}")
    println(checkSize(area))
}

fun checkSize(area : Double) = if(area > 100) "Big Circle" else "Small Circle"
