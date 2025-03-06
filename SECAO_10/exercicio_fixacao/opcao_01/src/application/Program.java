package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        String email;
        String[] names = new String[10];
        String[] emails = new String[10];
        int[] rooms = new int[10];

        // Inicializa todos os quartos como -1 (indicando que estão vazios)
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = -1;
        }

        System.out.print("How many rooms do you want to reserve? ");
        int reserve = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < reserve; i++) {
            System.out.println("Rent #" + (i + 1));

            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();

            int room;
            while (true) {
                System.out.print("Room Number (0 a 9): ");
                room = sc.nextInt();
                sc.nextLine();

                if (room < 0 || room > 9) {
                    System.out.println("Invalid room number - Choose between 0 and 9.");
                } else if (rooms[room] != -1) {
                    System.out.println("Occupied room - Choose another one.");
                } else {
                    break;
                }
            }
            names[room] = name;
            emails[room] = email;
            rooms[room] = room;
        }

        System.out.println("----------Busy rooms---------");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != -1) {
                System.out.println(i + ": " + names[rooms[i]] + ", " + emails[rooms[i]]);
            }
        }
        sc.close();
    }
}