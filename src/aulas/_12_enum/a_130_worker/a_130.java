package aulas._12_enum.a_130_worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class a_130 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        System.out.print("Enter department name: ");
        Department department = new Department(sc.nextLine());
        Worker worker = new Worker();
        worker.setDepartment(department);
        System.out.println("Enter work data: ");
        System.out.print("Name: ");
        worker.setName(sc.nextLine());
        System.out.print("Level: ");
        worker.setLevel(sc.nextLine());
        System.out.print("Base salary: ");
        worker.setBaseSalary(sc.nextDouble());
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double value = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            worker.addContract(new HourContract(date, value, hours));
            sc.nextLine();
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year,month)));

        sc.close();
    }
}
