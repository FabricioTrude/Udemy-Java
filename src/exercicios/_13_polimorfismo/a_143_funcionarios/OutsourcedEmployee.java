package exercicios._13_polimorfismo.a_143_funcionarios;

class OutsourcedEmployee extends Employee{
    private double additionalCharge;

    public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double Payment() {
        return super.Payment() + additionalCharge * 1.1;
    }
}
