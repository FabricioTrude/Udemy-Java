package aulas._4_sequential;
import java.util.Locale;

public class a_31_print {
    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J"); // limpa terminal
        Locale.setDefault(Locale.US); // troca . e ,
        System.out.println("Hello, World!");
        int i = 32;
        double f = 10.50122345678; // float
        char c = 'a';
        String s = "palavra";
        System.out.println(i); // %d apenas
        System.out.printf("%.2f%n",f); // %f apenas
        System.out.println(c); // %c ou %s
        System.out.println(s); // %s apenas
    }
}
