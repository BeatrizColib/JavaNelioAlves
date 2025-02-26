package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("___Let's check the employee's salary data___");
        System.out.print("Enter the employee's name: ");
        String name = sc.nextLine();
        System.out.print("Enter the employee's  gross salary: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Enter the employee's tax: ");
        double tax = sc.nextDouble();

        //instanciando obj e atribuindo valores
        Employee employee01 = new Employee();
        employee01.name = name;
        employee01.grossSalary = grossSalary;
        employee01.tax = tax;

        employee01.netSalary();
        System.out.println(employee01);
        System.out.println();

        System.out.print("Wich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee01.increaseSalary(percentage);
        System.out.println();

        sc.close();
    }
}
