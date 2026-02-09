package oop_115708_DominikusDylon.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("WELCOME TO LIBRARY LOAN SYSTEM")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Anda: ")
    val borrower = scanner.nextLine()

    print("Masukkan lama durasi peminjaman: ")
    val loanDuration = scanner.nextInt()

    val loan = Loan(bookTitle, borrower, loanDuration) // ini baru panggil classnya
    val totalFine: Int = loan.calculateFine()

    println(loan.bookTitle)
    println(loan.borrower)
    println(loan.loanDuration)
    println(totalFine)

}