package aulas._15_files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class a_163_file_scanner {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\text.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()) System.out.println(sc.nextLine());
        } catch(Error | IOException e){
            System.out.println(e.getMessage());
        } finally{
            if (sc != null) sc.close();
        }
    }
}
