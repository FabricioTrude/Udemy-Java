package aulas._12_enum.a_134_order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class a_134 {

    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        Client client = new Client();
        System.out.print("Name: ");
        client.setName(sc.nextLine());
        System.out.print("Email: ");
        client.setEmail(sc.nextLine());
        System.out.print("Birth date (DD/MM/YYYY): ");
        client.setBirthDate(sdf.parse(sc.next()));

        System.out.println("Enter order data: ");
        Order order = new Order();
        order.setClient(client);
        System.out.print("Status: ");
        order.setStatus(OrderStatus.valueOf(sc.next()));
        System.out.print("How many items in this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.println("Enter #" + i + " data:");
            System.out.print("Product name: ");
            String pname = sc.nextLine();
            System.out.print("Product price: ");
            double pprice = sc.nextDouble();
            System.out.print("Quantity: ");
            int pquant = sc.nextInt();
            sc.nextLine();

            order.addItem(new OrderItem(new Product(pname, pprice), pquant));
        }
        
        System.out.println("ORDER SUMMARY: ");
        System.out.println("Order moment: " + order.getMoment());
        System.out.println("Order status: " + order.getStatus());
        System.out.println(client);
        System.out.println("Order items: ");
        order.showItems();

        sc.close();
    }
}
