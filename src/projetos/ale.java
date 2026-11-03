package projetos;

public class ale {
    public static void main(String[] args) {
        Garrafa centauro = new Garrafa();
        centauro.cor = "Preto";
        centauro.capacidade = 800.0;
        centauro.atual = 450.0;

        Garrafa zelo = new Garrafa();
        zelo.cor = "Azul";

        centauro.beber();
        centauro.beber();
        System.out.println(centauro.getAtual());
        centauro.encher();
        //System.out.println(centauro.getCheio());
    }
    static class Garrafa{
        double capacidade;
        double atual;
        String cor;
        String liquido;

        Boolean getCheio(){
            return new Boolean(atual >= capacidade);
        }
        void encher(){
            atual = capacidade;
        }
        void beber(){
            atual -= 100;
        }

        String getAtual(){
            return atual + " ml";
        }
    }
}
