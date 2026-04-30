package oop_115708_DominikusDylon.Week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")

    response.data.forEach { coin ->
        println("Coin: $(coin.name), Balance: ${coin.balance}")
    }

    println("\n=== Transactions ===")

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 500.0))
    txRepo.add(Transaction("TX002", 1500.0))
    txRepo.add(Transaction("TX003", 250.0))

    txRepo.getAll().forEach { tx ->
        println("Transaction ID: ${tx.id}, Amount: ${tx.amount}")
    }
}