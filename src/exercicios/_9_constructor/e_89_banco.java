package exercicios._9_constructor;

import java.util.Scanner;

import utils.Clear;

public class e_89_banco{
    public static void main(String[] args) {
        Clear.clearScreen();
        Scanner sc = new Scanner(System.in);

        Conta c1 = new Conta();
        c1.criarConta("Fabrício", 165877);
        c1.depositar(1500);
        c1.sacar(2000);
        sc.close();
    }

    public static class Conta{
        public String nome;
        private int codigo;
        private double saldo;

        public Conta(){
            System.out.println("Para criar uma conta, por favor insira:");
            System.out.println("Nome do titular, Código da conta e um depósito inicial(opcional).");
        }
        public Conta(String nome, int codigo, double saldo) {
            this.nome = nome;
            this.codigo = codigo;
            this.saldo = saldo;
            saldoInicial();
        }
        public void criarConta(String nome, int codigo, double saldo){
            this.nome = nome;
            this.codigo = codigo;
            this.saldo = saldo;
            saldoInicial();
        }
        public void criarConta(String nome, int codigo){
            this.nome = nome;
            this.codigo = codigo;
            this.saldo = 0;
            saldoInicial();
        }
        private void saldoInicial(){
            System.out.println("Conta criada com sucesso! Saldo inicial: " + saldo);
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getCodigo() {
            return codigo;
        }
        public void getSaldo() {
             System.out.printf("Saldo do usuário %s: %.2f%n", nome, saldo);
        }
        public void depositar(double valor){
            this.saldo += valor;
            System.out.printf("Depósito efetuado com sucesso!%n");
            getSaldo();
        }
        public void sacar(double valor){
            if(this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque efetuado com sucesso!");
            } else System.out.println("Saldo insuficiente, saque mal sucedido.");
            getSaldo();
        }
    }
}