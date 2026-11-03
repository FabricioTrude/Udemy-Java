package exercicios._13_polimorfismo.a_143_funcionarios;

import java.util.Scanner;

public class a_143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] employees = new Employee[n];

        for(int x = 0; x < employees.length; x++){
            System.out.println("Employee #" + (x+1) + " data:");
            System.out.print("outsorced? (y/n): ");
            char etype = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String ename = sc.nextLine();
            System.out.print("Hours: ");
            Integer ehours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hours: ");
            double evalue = sc.nextDouble();
            sc.nextLine();

            if(etype == 'y' || etype == 'Y'){
                System.out.print("Additional charge: ");
                double echarge = sc.nextDouble();
                sc.nextLine();
                employees[x] = new OutsourcedEmployee(ename, ehours, evalue, echarge);

            } else employees[x] = new Employee(ename, ehours, evalue);
        }

        System.out.println("PAYMENTS: ");
        for(Employee employee:employees) System.out.printf("%s - $ %.2f%n", employee.getName(), employee.Payment());
        sc.close();
    }
}
