package exercicios._14_error.a_159;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter account number: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Please enter holder's name");
        String name = sc.nextLine();
        System.out.print("Enter account initial balance (optional): ");
        double balance = sc.nextDouble();
        System.out.print("Lastly, enter account withdraw limit: ");
        double wl = sc.nextDouble();
        Account ac1 = new Account(n, name, balance, wl);

        try {
            ac1.deposit(2000);
            ac1.withdraw(100);
            ac1.withdraw(999999);
        } catch (BalanceException e){
            System.out.println("Error: " + e.getMessage());
        } finally{
            sc.close();
        }
    }
}
