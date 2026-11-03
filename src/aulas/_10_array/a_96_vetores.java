package aulas._10_array;

import java.util.Scanner;

import utils.Clear;

public class a_96_vetores {
    public static void main(String[] args) {
        Clear.clearScreen();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão medidas? ");
        int n = sc.nextInt();
        double[] medidas = new double[n];
        double total = 0.0;
        for(int medida = 0; medida<n;medida++){
            medidas[medida] = sc.nextDouble(); 
            total += medidas[medida];
        }
        System.out.printf("Média das alturas: %.2f", total/n);
        sc.close();
    }
}
