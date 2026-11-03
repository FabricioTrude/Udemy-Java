
package aulas._4_sequential;

import java.util.Scanner;

public class a_34_scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;
        int x;

        x = sc.nextInt(); // 15
        sc.nextLine(); // faz a quebra

        s1 = sc.nextLine(); // bom dia
        s2 = sc.next(); // boa
        s3 = sc.next(); // tarde

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    }    
}
