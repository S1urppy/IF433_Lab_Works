package oop_115708_DominikusDylon.Week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)