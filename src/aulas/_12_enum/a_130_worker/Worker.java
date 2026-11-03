package aulas._12_enum.a_130_worker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Department department;

    private List<HourContract> contracts = new ArrayList<>();

    void addContract(HourContract contract){
        contracts.add(contract);
    }
    void removeContract(HourContract contract){
        contracts.remove(contract);
    }
    double income(int year, int month){
     double sum = baseSalary;
     Calendar cal = Calendar.getInstance();
     for(HourContract c : contracts){
         cal.setTime(c.getDate());
         int c_year = cal.get(Calendar.YEAR);
         int c_month = cal.get(Calendar.MONTH);
         if(year == c_year && month == c_month) sum += c.totalValue();
     }
     return sum;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    WorkerLevel getLevel() {
        return level;
    }

    void setLevel(String level) {
        this.level = WorkerLevel.valueOf(level);
    }

    double getBaseSalary() {
        return baseSalary;
    }

    void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                '}';
    }

    void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    String getDepartment() {
        return department.getName();
    }

    List<HourContract> getContracts() {
        return contracts;
    }
}
