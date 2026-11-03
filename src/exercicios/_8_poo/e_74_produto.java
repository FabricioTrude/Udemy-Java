package exercicios._8_poo;

import java.util.Scanner;
import utils.Clear;

public class e_74_produto {
    public static void main(String[] args) {
        Clear.clearScreen();
        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        System.out.print("Name: ");
        p.name = sc.nextLine();
        System.out.print("Price: ");
        p.price = sc.nextDouble();
        System.out.print("Quantity: ");
        p.quantity = sc.nextInt();
        p.data();
        
        System.out.print("Enter the number of products to be added in stock: ");
        p.add(sc.nextInt());

        System.out.print("Enter the number of products to be removed from stock: ");
        p.remove(sc.nextInt());
        sc.close();
    }
    static class Product {
        public String name;
        public double price;
        public int quantity;

        public Product(){
            System.out.println("Enter product data:");
        }

        public void add(int x){
            quantity += x;
            update();
        }

        public void remove(int x){
            quantity -= x;
            update();
        }
        public void data(){
            System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", name, price, quantity, (price * quantity));
        }
        public void update(){
            System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", name, price, quantity, (price * quantity));
        }
    }
}