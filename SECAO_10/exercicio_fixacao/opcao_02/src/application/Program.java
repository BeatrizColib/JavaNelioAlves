package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms would you like to rent? ");
        int qnt = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qnt; i++) {
            System.out.println("\nRent #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();

            vect[roomNumber] = new Rent(name,email);
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
