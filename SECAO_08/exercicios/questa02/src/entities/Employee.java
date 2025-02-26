package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    double netSalary;

    public double netSalary(){
      netSalary = grossSalary - tax;
      return netSalary;
    }

    @Override
    public String toString() {
        return String.format("Employee: %s, $ %.2f", name, netSalary); //%s para string - %.2f para double - %d para int
    }

    public void increaseSalary(double percentage){
        grossSalary += (grossSalary * (percentage / 100)) - tax;
        System.out.println(String.format("Update data: %s, $ %.2f", name, grossSalary));
    }
}
