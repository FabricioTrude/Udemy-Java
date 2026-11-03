package aulas._10_array;

import java.util.Locale;
import java.util.Scanner;

import utils.Clear;

public class a_97_vetor_classe {
    public static void main(String[] args) {
        Clear.clearScreen();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos produtos? ");
        int n = sc.nextInt();
        Product[] product = new Product[n];

        double sum = 0.0;
        for(int i = 0; i<n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            product[i] = new Product(name, price);
            System.out.printf("Criado %s com preço de: %.2f", product[i].getName(), product[i].getPrice());
            sum += product[i].getPrice();
        }

        System.out.printf("Média dos preços: %.2f", sum/product.length);        

        sc.close();
    }
    private static class Product{
        private String name;
        private double price;
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
        public double getPrice() {
            return price;
        }
        public String getName() {
            return name;
        }
    }
}
