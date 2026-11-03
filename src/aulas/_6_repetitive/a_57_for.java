package aulas._6_repetitive;

public class a_57_for {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos", "Fabrício", "Milena", "Pedro"};

        // old
        // for(int i = 0; i<nomes.length; i++){
        //     System.out.println(nomes[i]);
        // }

        // eu vou gozar
        for(String nome:nomes) System.out.println(nome);
    }
}
