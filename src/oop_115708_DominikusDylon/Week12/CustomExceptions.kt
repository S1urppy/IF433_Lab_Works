package oop_115708_DominikusDylon.Week12

class InsufficientFundsExceptions(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")

class BankAccount(var balance : Double) {
    fun withdraw(amount: Double) {
        if (amount < 0) {
            throw IllegalArgumentException("amount must be positive")
        }
        if (amount > balance) {
            throw InsufficientFundsExceptions(amount, balance)
        }
        balance -= amount
        println("Withdrawal successful. Remaining balance: $balance")
    }
}

fun main(){
    println("=== TEST MULTIPLE CATCH ===")
    val account = BankAccount(100.0)

    try {
        account.withdraw(150.0)
    } catch (e: InsufficientFundsExceptions){
        println("Caught Domain Error: uang tidak cukup. ${e.message}")
    } catch (e: IllegalArgumentException) {
        println("Caught Argument Error: Input tidak valid. ${e.message}")
    } catch (e: Exception) {
        println("Caught General Error: Terjadi kesalahan tak terduga.")
    }
}