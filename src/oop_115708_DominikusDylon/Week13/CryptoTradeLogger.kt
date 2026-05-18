package oop_115708_DominikusDylon.Week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord (
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val data = line.split(",")

        if (data.size != 5) {
            return null
        }

        return TradeRecord(
            id = data[0].toInt(),
            symbol = data[1],
            type = data[2],
            margin = data[3].toDouble(),
            pnl = data[4].toDouble()
        )
    } catch (e: Exception) {
        println("(log) Data korup diabaikan: $line")
        null
    }

}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path)
            .readLines()
            .mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("(log) File tidak ditemukan: $path")
        emptyList()
    }
}

fun main() {
    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 1500.0, 320.5),
        TradeRecord(2, "ETHUSDT", "Short", 1000.0, -120.75),
        TradeRecord(3, "SOLUSDT", "Long", 800.0, 210.0)
    )

    saveTrades(trades, "crypto_trades.csv")

    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    val loadedData = loadTrades("crypto_trades.csv")
    val totalPnL = loadedData.sumOf{ it.pnl }

    println("=== DATA TRADE VALID ===")

    loadedData.forEach { trade ->
        println(trade)
    }
    println("=== TOTAL PnL BERSIH: $totalPnL ===")
}