package oop_115708_DominikusDylon.Week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()
    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(name: String): List<T>? {
        return items.filter {
            (it as? Coin)?.name == name
        }
    }
}