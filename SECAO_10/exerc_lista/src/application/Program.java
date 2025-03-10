package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeesList = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int quantity = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantity; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            sc.nextLine();

            //criando primeiro um objeto da classe Employee pra depois coloca-lo na list
            Employee emp = new Employee(id, name, salary);

            //adicionando na lista
            employeesList.add(emp);
        }
        System.out.println("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();
        sc.nextLine();

        Employee emp = employeesList.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);

        if (emp != null) {
            System.out.println("Enter the percentage of the increase: ");
            double perc = sc.nextDouble();
            emp.increaseSalary(perc);
        }
        sc.close();
    }
}
