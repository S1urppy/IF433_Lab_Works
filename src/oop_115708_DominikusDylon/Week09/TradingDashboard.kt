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
}