package entities;

import enums.WokerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Woker {
    private String name;
    private WokerLevel level;
    private Double baseSalary;
    private Departament department;

    List<HourContract> contracts = new ArrayList<>();

    //const
    public Woker() {
    }

    public Woker(String name, WokerLevel level, Double baseSalary, Departament department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    //get set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WokerLevel getLevel() {
        return level;
    }

    public void setLevel(WokerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartment() {
        return department;
    }

    public void setDepartment(Departament department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    //methods
    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH) + 1; //soma 1 porque o Calendar começa contando janeiro como mês 0.
            if (c_year == year && c_month == month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
