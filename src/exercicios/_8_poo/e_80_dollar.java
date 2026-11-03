package exercicios._8_poo;

import java.util.Locale;
import java.util.Scanner;
import utils.CalculadoraFinanceira;
import utils.Clear;

public class e_80_dollar {
    public static void main(String[] args) {
        Clear.clearScreen();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quantity = sc.nextDouble();
        
        double total = CalculadoraFinanceira.reais(dollar,quantity);
        System.out.printf("Amount to be paid in reais = %.2f", total);
        sc.close();
    }
}
