package oop_115708_DominikusDylon.week01

import com.sun.jdi.IntegerType

fun main (){
    val gameTitle: String = "Tomb Rider"
    val price: Int = 200000
}

fun calculateDiscount(price: Int): Int = if(price > 500000) price*80/100 else price*90/100