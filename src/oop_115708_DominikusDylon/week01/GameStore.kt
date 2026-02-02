package oop_115708_DominikusDylon.week01

import com.sun.jdi.IntegerType

fun main (){
    val gameTitle: String
    val price: Int
    var userNote: String? = null

    printRecipt(title = "Tomb Rider", finalPrice = calculateDiscount(price = 200000), userNote)
}

fun calculateDiscount(price: Int): Int = if(price > 500000) price*80/100 else price*90/100
fun printRecipt(title: String, finalPrice: Int, userNote: String?){
        println("title: $title, finalPrice: $finalPrice")
    println(if (userNote?.length == null) "Tidak ada catatan" else userNote)
}