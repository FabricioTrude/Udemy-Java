package aulas._14_error;

import java.util.InputMismatchException;
import java.util.Scanner;

class a_153_stack_trace {
    public static void main(String[] args) {

        method1();

        System.out.println("End of Program");
    }

    static void method1(){
        System.out.println("Start of Method 1");
        method2();
        System.out.println("End of Method 1");
    }

    static void method2(){
        System.out.println("Start of Method 2");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Position Invalid");
            System.out.print(e);
        }
        catch(InputMismatchException e){
            System.out.println("Input Error");
        }
        System.out.println("End of Method 2");
        sc.close();
    }
}
