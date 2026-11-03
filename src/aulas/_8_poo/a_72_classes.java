package aulas._8_poo;

import java.util.Scanner;

public class a_72_classes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        sc.close();
        System.out.printf("Triangulo X tem área de: %.2f%n", x.getArea());
        System.out.printf("Triangulo Y tem área de: %.2f%n", y.getArea());
        if(x.getArea() > y.getArea()) System.out.println("X has larger area");
        else System.out.println("Y has larger area");
    }
    static class Triangle {
        public double a;
        public double b;
        public double c;
        public double getP(){
            return (a + b + c) / 2;
        }
        public double getArea(){
            double p = getP();
            return Math.sqrt(
                    p * (p-a) * (p-b) * (p-c)
            );
        }
    }

}
