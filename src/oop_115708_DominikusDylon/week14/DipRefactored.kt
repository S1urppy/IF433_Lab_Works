package oop_115708_DominikusDylon.week14

interface Database {
    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {
    override fun query(sql: String) = listOf("pq_data1", "pq_data2")
}