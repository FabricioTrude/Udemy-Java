package utils;

public class CalculadoraFinanceira {
    private static final double TAXA = 1.06;
    public static double reais(double dollar, double amount){
        return dollar * amount * TAXA;
    }
}
