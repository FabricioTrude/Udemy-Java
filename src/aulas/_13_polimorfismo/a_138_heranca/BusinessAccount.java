package aulas._13_polimorfismo.a_138_heranca;

public class BusinessAccount extends  Account {
    private double loanLimit;

    BusinessAccount() {
        super();
    }

    BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    void loan(double amount){
        if(amount <= loanLimit)deposit(amount);
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
