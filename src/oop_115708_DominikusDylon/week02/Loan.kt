package oop_115708_DominikusDylon.week02

class Loan(val bookTitle: String, val borrower: String, var loanDuration: Int = 1){
    fun calculateFine(): Int {
        if (loanDuration < 0 ){
            loanDuration = 1;
        }
        return if (loanDuration > 3){
            (loanDuration - 3) * 2000
        }else {
            0;
        }
    }
}
