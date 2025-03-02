package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.next();
        sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        String answer = sc.nextLine();
        /*
        aqui poderia ser:
        char answer = sc.next().charAt(0);
        if (answer == 'y'){...
         */
        double depositValue = 0;
        if (answer.equalsIgnoreCase("y")) {
            System.out.print("Enter initial deposit value: ");
            depositValue = sc.nextDouble();
        } else {
            depositValue = 0;
        }

        BankAccount bankAccount01 = new BankAccount(accountNumber, accountHolder, depositValue);

        System.out.println("\nAccount data:\n" + bankAccount01.toString());

        System.out.print("Enter a deposit value: ");
        depositValue = sc.nextDouble();
        bankAccount01.depositInAccount(depositValue);
        System.out.println("Update account data: \n" + bankAccount01.toString());

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount01.withdrawInAccount(withdrawValue);
        System.out.println("Update account data: \n" + bankAccount01.toString());

        sc.close();
    }
}
