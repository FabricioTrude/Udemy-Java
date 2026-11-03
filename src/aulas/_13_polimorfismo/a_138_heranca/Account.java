package aulas._13_polimorfismo.a_138_heranca;

class Account {
    private Integer number;
    private String holder;
    private double balance;

    Account() {
    }

    Account(Integer number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    void withdraw(double amount){
        balance -= amount;
    }
    void deposit(double amount){
        balance += amount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }
}
