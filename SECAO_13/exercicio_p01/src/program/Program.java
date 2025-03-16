package program;

import entities.Employee;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        for (int i =1; i<=quantity; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsource (y/n)? ");
            String response = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            sc.nextLine();

            if(response.equalsIgnoreCase("y")){
                System.out.print("Additional charge: $ ");
                Double additionalCharge = sc.nextDouble();

                Employee employee = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(employee);
                sc.nextLine();
            } else if (response.equalsIgnoreCase("n")){
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
        }

        System.out.println("\nPAYMENTS:");
        for (Employee employee : employees){
            System.out.println(employee);
        }


        sc.close();
    }
}
