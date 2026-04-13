package oop_115708_DominikusDylon.Week08

fun main(){
    print("===TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}