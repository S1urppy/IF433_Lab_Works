package oop_115708_DominikusDylon.Week05

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0): PaymentMethod(accountName){
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit ){
            usedAmount = usedAmount + amount
            println("Suksess")
        } else {
            println("Transaksi ditolak")
        }
    }
}