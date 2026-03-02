package oop_115708_DominikusDylon.Week05

abstract class PaymentMethod(val accoountName: String) {
    abstract fun processPayment(amount: Double)
}