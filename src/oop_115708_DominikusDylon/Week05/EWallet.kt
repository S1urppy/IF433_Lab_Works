package oop_115708_DominikusDylon.Week05

class EWallet(accountName: String, var balance: Double): PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount){
            balance = balance - amount
            println("Suksess")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topup(amount: Double){
        balance = balance + amount
        println("TopUp berhasil")
    }
}