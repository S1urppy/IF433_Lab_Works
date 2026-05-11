package oop_115708_DominikusDylon.Week12

class InsufficientFundsExceptions(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")