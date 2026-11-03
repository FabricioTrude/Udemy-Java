package exercicios._14_error.a_159;

class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount) throws BalanceException{
        if (amount > balance) throw new BalanceException("Not enough credit in your balance.");
        if (amount > withdrawLimit) throw new BalanceException("Amount higher than withdraw limit.");
        balance -= withdrawLimit;
    }
}
