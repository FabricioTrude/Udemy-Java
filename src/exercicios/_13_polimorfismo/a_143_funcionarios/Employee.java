package exercicios._13_polimorfismo.a_143_funcionarios;

public class Employee {
    private String name;
    private Integer hours;
    protected double valuePerHour;

    public Employee(String name, Integer hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public double Payment(){
        return valuePerHour*hours;
    }

    public String getName() {
        return name;
    }
}
