package aulas._13_polimorfismo.a_139_upcast;

// final a classe não pode ser herdada/extendida
// static class SavingsAccountPlus extends SavingsAccount{} // Error

public final class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    void updateBalance(){
        balance += balance * interestRate;
    }

    @Override
    void withdraw(double amount) {
         balance-=(amount+5);
    }
}
