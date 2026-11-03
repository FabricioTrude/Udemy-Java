package exercicios._8_poo;

import java.util.Scanner;

import utils.Clear;

class e_77_retangulo {
    public static void main(String[] args) {
        Clear.clearScreen();
        Scanner sc = new Scanner(System.in);
        Retangulo r1 = new Retangulo();
        r1.width = sc.nextDouble();
        r1.height = sc.nextDouble();
        sc.close();
        r1.data();
    }
    private static class Retangulo{
        double width, height;
        public Retangulo(){
            System.out.println("Enter rectangle width and height: ");
        }
        public double perimeter(){
            return (2*width) + (2*height);
        }
        public double area(){
            return width * height;
        }
        public double diagonal(){
            return Math.sqrt((width*width)+(height*height));
        }
        public void data(){
            System.out.println("AREA = " + this.area());
            System.out.println("PERIMETER = " + this.perimeter());
            System.out.println("DIAGONAL = " + this.diagonal());
        }
    } 
}