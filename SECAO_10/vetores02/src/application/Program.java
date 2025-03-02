package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the length of the products array? ");
        int lenghtArray = sc.nextInt();
        Product[] products = new Product[lenghtArray];
        System.out.println();

        for (int i = 0; i<lenghtArray; i++){
            sc.nextLine();
            System.out.print("Whats is the product name? ");
            String name = sc.nextLine();
            System.out.print("Whats is the price of the product? ");
            double price = sc.nextDouble();
            products[i] = new Product(name,price);
        }

        double sum = 0;
        for (int i = 0; i <lenghtArray; i++){
            sum += products[i].getPrice();
        }
        double average = sum / lenghtArray;
        System.out.println();
        System.out.printf("The average of the products is: $ %.2f", average);

        sc.close();
    }
}
