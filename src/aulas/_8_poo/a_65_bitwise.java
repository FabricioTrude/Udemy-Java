package aulas._8_poo;

public class a_65_bitwise {
    public static void main(String[] args) {
        int n1 = 89, n2 = 60;

        System.out.println(~n1); // not
        System.out.println(n1 & n2); // and
        System.out.println(n1 | n2); // or
        System.out.println(n1 ^ n2); // xor
        System.out.println(~(n1^n2) & 0b1111); // xnor (apenas 4 bits)
        
        System.out.println(n1   << 1); // empurra bits 

        int mask = 0b100000;
        int n = 40;

        if((n & mask) != 0) System.out.println("6th bit is true");
        else System.out.println("6th bit is false!");
    }
}