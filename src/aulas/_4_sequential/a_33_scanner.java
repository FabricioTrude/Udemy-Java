package aulas._4_sequential;

import java.util.Scanner;

public class a_33_scanner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String x = sc.next();
        System.out.printf("Você digitou: %s%n",x);

        char c = sc.next().charAt(0);
        System.out.printf("E agora a tecla: %c%n", c);

        int y = sc.nextInt();
        System.out.printf("Agora você digitou o número: %d%n", y);

        double d = sc.nextDouble();
        System.out.printf("Seu número com 2 casas é: %.2f", d);

        sc.close();
    }
}
