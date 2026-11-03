package aulas._14_error;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class a_154_finally {
    public static void main(String[] args) {
//        String path = System.getProperty("user.dir");
        String path = "aaaa";
        File file = new File(path + "\\src\\aulas\\_14_error\\text.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            if (sc != null) sc.close();
            System.out.println("Fim do programa");
        }
    }
}
