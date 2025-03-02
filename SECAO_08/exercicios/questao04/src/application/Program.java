package application;

import Utils.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: $ ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? $ ");
        double amount = sc.nextInt();

        double result = CurrencyConverter.convert(dollarPrice, amount);

        System.out.println("Amount to be paid in reais = R$ " + result);
        sc.close();
    }
}
