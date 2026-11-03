package aulas._8_poo;

public class a_66_string {
    public static void main(String[] args) {
        String s = "        AsSim que sE escREVe!";
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.substring(10));
        System.out.println(s.charAt(20));
        System.out.println(s.replace("escreve", "fala"));
        System.out.println(s.indexOf('e'));
        System.out.println(s.lastIndexOf('e'));
        String[] vect = s.split(" ");
        System.out.println(vect);
        for(String v:vect) if(s != " ")System.out.println(v);
    }
}
