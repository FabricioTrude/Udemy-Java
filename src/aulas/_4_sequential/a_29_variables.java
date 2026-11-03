package aulas._4_sequential;

public class a_29_variables {
    public static void main(String[] args) {

        // numeros inteiros
        byte Byte = 127; // 8bits -128 a 127
        short Short = 30999; // 16bits -32768 a 32767
        int Int = 214; // 32bits -2bi a 2bi
        long Long = 15; // 64bits -9qi a 9qi

        // numeros decimais
        float Float = 22.5978312f; // 32bits -1e-37 a 3,4e38
        double Double = 5.5; // 64bits -4.94e-307 a 1,79e308

        // unicode
        char Char = '\u262D'; // 16bits - ☭
        System.out.println(Char);
        boolean Boolean = true; // 1bit {true, false}
        String string = "AAA"; // cadeia de caracteres

        String A = "Arroz";
        String B = "Arroz";

        System.out.println(A == B);
        // o == aponta pro objeto, não o conteúdo

        String a = new String("Arroz");
        String b = new String("Arroz");
        // aqui explicitamente são dois objetos diferentes

        System.out.println(a == b);

        System.out.println(a.equals(b));


        Integer i1 = 1000;
        Integer i2 = 1000;

        System.out.println(i1 == i2);
        // vai dar negativo pq ja começam como objetos diferentes
        // pq 1000 ta fora do cache de Integer, ai cria um objeto novo
        // 100 por exemplo ainda ta dentro, daria true
        System.out.println(i1.equals(i2));

        // == "é o mesmo objeto?"
        // .equals "o conteúo é o mesmo?"
    }
}
