package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<=quantity; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or Company? (i/c): ");
            String type;//trim - remove espaços antes e depois
            while (true){
                type = sc.nextLine().trim().toLowerCase();
                if (type.equals("c") || type.equals("i")){
                    break;
                } else {
                    System.out.print("Invalid type! Individual or Company? (i/c): ");
                }
            }

            System.out.print("Name: ");
            String name = sc.nextLine().trim();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            sc.nextLine();

            switch (type){
                case "i":
                    System.out.print("Health expenditure: ");
                    Double healthExpenditure = sc.nextDouble();
                    sc.nextLine();

                    TaxPayer taxPayerInd = new Individual(name, anualIncome, healthExpenditure);
                    taxPayers.add(taxPayerInd);

                    break;
                case "c":
                    System.out.print("Number of employees: ");
                    Integer numOfEmployees = sc.nextInt();
                    sc.nextLine();

                    TaxPayer taxPayerComp = new Company(name, anualIncome, numOfEmployees);
                    taxPayers.add(taxPayerComp);
                    break;
            }
        }

        System.out.println("\nTAXES PAID:");
        for (TaxPayer taxPayer : taxPayers){
            System.out.println(taxPayer.toString());
        }

        Double sumTax = 0.0;
        for (TaxPayer taxPayer : taxPayers){
            sumTax += taxPayer.tax();
        }
        System.out.println("\nTOTAL TAXES: " + String.format("%.2f", sumTax));

        sc.close();
    }
}
