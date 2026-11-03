package aulas._14_error.a_155_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class a_155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

        try {
            System.out.print("Room Number: ");
            int number = sc.nextInt();
            System.out.print("Check-in (dd/mm/yyyy): ");
            Date checkin = sdf.parse(sc.next());
            System.out.print("Check-out (dd/mm/yyyy): ");
            Date checkout = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update reservation");
            System.out.print("Check-in (dd/mm/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.print("Check-out (dd/mm/yyyy): ");
            checkout = sdf.parse(sc.next());

            reservation.updateDates(checkin, checkout);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e){
            System.out.println("Invalid date format");
        } catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Unexpected error");
        }finally{
            sc.close();
        }
    }
}
