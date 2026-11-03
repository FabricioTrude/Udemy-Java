package aulas._12_enum.a_130_worker;

import java.util.Date;

class HourContract {
    private Date date;
    private double valuePerHour;
    private Integer hours;

    public HourContract(Date date, double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    double totalValue(){
        return hours * valuePerHour;
    }

    public Date getDate() {
        return date;
    }
}
