package program;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many persons will you enter? ");
        int quantity = sc.nextInt();
        sc.nextLine();
        String[] names = new String[quantity];
        int[] ages = new int[quantity];
        double[] heights = new double[quantity];
        Person[] people = new Person[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.print("Person " + (i + 1) + " - Name: ");
            String name = sc.nextLine();
            names[i] = name;

            System.out.print("Age: ");
            ages[i] = sc.nextInt();

            System.out.print("Height: ");
            heights[i] = sc.nextDouble();
            sc.nextLine();

            people[i] = new Person(name, ages[i], heights[i]);
        }
        System.out.println();

        double totalHeight = 0;
        int countUnder16 = 0;

        for (double h : heights) {
            totalHeight += h;
        }
        double averageHeight = totalHeight / quantity;
        System.out.printf("Average height: %.2f", averageHeight);
        System.out.println();

        for (int a : ages) {
            if (a < 16){
                countUnder16++;
            }
        }
        double percentageUnder16 = 0;
        percentageUnder16 = (100 * countUnder16) / quantity;

        System.out.printf("Number of people under 16 years: %d \nPercentage under 16 years: %.2f", countUnder16, percentageUnder16);
        System.out.println();
        for (Person p :people){
            if (p.getAge() <16){
                System.out.println("Name: " + p.getName() + " - Age: " + p.getAge());
            }
        }
        sc.close();
    }
}

/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
 */