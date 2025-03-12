package application;

import entities.Departament;
import entities.HourContract;
import entities.Woker;
import enums.WokerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException /*execeção pelo parse*/{

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //para receber a data formatada

        System.out.print("Enter departament's name: ");
        String nameDep = sc.nextLine();
        System.out.println("Enter woker data:");
        System.out.print("Name: ");
        String nameWorker = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        sc.nextLine();

        Woker woker = new Woker(nameWorker, WokerLevel.valueOf(level) /*enum*/, baseSalary, new Departament(nameDep) /*Classe instanciada*/);

        System.out.print("How many contrats to this worker? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data:");
            System.out.print("Date: (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next()); //recebendo a data formatada - criou-se um thrwos para tratar a exceção
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, duration); // instancia cada contrato para calcular seu valor
            woker.addContract(contract);//associa o contrato com o trabalhador
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthYear = sc.next();
        /*
        int month = monthYear.substring(0,2); ate 2 - pq ele nao conta o ultimo - pega os dois primeiros num
        agora para transformar o String em int, usa-se Interger.parseInt(coloca aqui dentro)
        */
        int month = Integer.parseInt(monthYear.substring(0, 2));
        int year = Integer.parseInt(monthYear.substring(3)); //do 3º ao ultimo


        System.out.println("Name: " + woker.getName() +
                "\nDepartament: " + woker.getDepartment().getName() +
                "\nIncome for " + monthYear + ": " + String.format("%.2f",woker.income(year, month)));

        sc.close();
    }
}
