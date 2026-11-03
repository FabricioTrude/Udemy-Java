package aulas._9_constructor;

import java.util.Locale;
import java.util.Scanner;

import utils.Clear;

public class a_83_constructor {
    public static void main(String[] args) {
        
        Clear.clearScreen();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        
        product.setData(name, price, quantity);

        System.out.println("Product data: " + product);
        
        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());
        System.out.println("Updated data: " + product);
        
        System.out.print("Enter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());
        System.out.println("Updated data: " + product);
        
        sc.close();
    }
    private static class Product{
        public String name;
        public double price;
        public int quantity;

        public Product(){
            System.out.println("Enter product data: ");
        }
        public void setData(String name, double price, int quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double totalValueInStock() {
        return price * quantity;
        }
        public void addProducts(int quantity) {
        this.quantity += quantity;
        }
        public void removeProducts(int quantity) {
        this.quantity -= quantity;
        }
        public String toString() {
        return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock());
        }
    }
}
