package oop_115708_DominikusDylon.Week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, 8.7, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 25, 12.3, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 5, -2.0, "CLOSED"),
        TradeLog("XRPUSDT", "SHORT", 30, 20.1, "CLOSED")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }

    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN | ${it.pair} - ${it.position}: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")

    topPerformersString.forEach {
        println(it)
    }

    worstPerformersString.forEach {
        println(it)
    }

    println(uniquePairs)
}
