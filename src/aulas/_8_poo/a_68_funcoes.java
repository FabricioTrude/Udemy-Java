package aulas._8_poo;

import java.util.Scanner;

public class a_68_funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // aqui é pra declarar o Scanner
        System.out.println("Digite três números: ");
        int x = sc.nextInt(); // aqui vai pegar 3 números
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.printf("%d, %d, %d%n",x,y,z); // tá mostrando na tela os 3 numeros que eu digitei

        int max = maior(x,y,z);
        resultado(max);

        sc.close();
    }
    public static int maior(int x, int y, int z){
        int aux;
        if(x > y && x > z) aux = x;
        else if(y > z) aux = y;
        else aux = z;
        return aux;
    }
    public static void resultado(int i){
        System.out.printf("O maior número entre eles é: %d", i);
    }
}