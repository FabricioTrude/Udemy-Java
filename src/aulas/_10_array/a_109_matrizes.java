package aulas._10_array;

import java.util.Scanner;
import utils.Clear;

public class a_109_matrizes {

    static int[][] matriz;
    public static void main() {
        Clear.clearScreen();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        matriz = new int[n][n];
        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                matriz[x][y] = sc.nextInt();
            }
        }
        
        diagonais();
        System.out.println();
        negativos();

        sc.close();
    }
    private static void diagonais(){
        int n = matriz.length;
        System.out.println("Valores diagonais: ");
        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                if(x == y)System.out.print(matriz[x][y] + " ");
            }
        }
    }
    private static void negativos(){
        int n = matriz.length;
        System.out.println("Valores negativos: ");
        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                if(matriz[x][y] < 0)System.out.print(matriz[x][y] + " ");
            }
        }
    }
}
