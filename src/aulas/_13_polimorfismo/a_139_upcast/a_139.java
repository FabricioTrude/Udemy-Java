package aulas._13_polimorfismo.a_139_upcast;

public class a_139{
    public static void main(String[] args) {
        Account acc = new Account(123, "Fabricio", 500);
        BusinessAccount bacc = new BusinessAccount(123, "Fabricio", 500, 2000);

//        UPCASTING
        Account acc1 = bacc;
        acc1.getBalance();
        Account acc2 = new BusinessAccount(1300, "Fabricio 2", 1500, 2000);
        Account acc3 = new SavingsAccount(51, "Fabricio Poupança", 200,0.02);

//        DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100);
        // BusinessAccount acc5 = (BusinessAccount)acc3; // ERROR
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200);
            System.out.println("Loan!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
