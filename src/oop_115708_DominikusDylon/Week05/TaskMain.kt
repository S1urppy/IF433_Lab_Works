package oop_115708_DominikusDylon.Week05

fun main() {
    val math = MathHelper()

    println(math.hitungLuas(4))
    println(math.hitungLuas(6,4))
    println(math.hitungLuas(4.4))


    val EWallet = EWallet("Yanto", 50000.00)
    val CreditCard = CreditCard("Ahmad", 100000.00)

    val payments: List<PaymentMethod> =listOf(EWallet, CreditCard)
    for (method in payments){
        method.processPayment(75000.00)

        if (method is EWallet){
            println("Top up EWallet")
            method.topup(50000.00)

            method.processPayment(75000.00)
        }
    }
}