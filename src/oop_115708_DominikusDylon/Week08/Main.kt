package oop_115708_DominikusDylon.Week08

fun main(){
    print("===TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    val validOrder = Order(null, 250000)
    val recipt = validOrder.totalPrice?.let { price -> val tax = price * 0.11
        "Transaksi valid. Harga: Rp$price, Pajak: Rp$tax"} ?: "Transaksi Invalid: Harga belum di set!"
    println(recipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = ListOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop"
        4500000.0
    )

    for (item in mixedData){
        val text = item as? String
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }
}