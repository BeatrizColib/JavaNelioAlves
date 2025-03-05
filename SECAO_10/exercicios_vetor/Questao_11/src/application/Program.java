package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many person will you enter: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        Person[] persons = new Person[quantity];

        for(int i = 0; i < quantity; i++){
            System.out.print("Enter a name: ");
            String name = sc.nextLine();
            System.out.print("Enter height: ");
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.print("Gender: Female(F) or Male(M): ");
            String gender = sc.nextLine();

            persons[i] = new Person(name, height, gender);
        }
        System.out.println();

        //maior e menor alturas
        double minHeight = persons[0].getHeight();
        String minHeightName = persons[0].getName();
        double maxHeight = persons[0].getHeight();
        String maxHeightName = persons[0].getName();
        for(int i = 0; i < persons.length; i++){
            if(persons[i].getHeight() < minHeight){
                minHeight = persons[i].getHeight();
                minHeightName = persons[i].getName();
            }
            if(persons[i].getHeight() > maxHeight){
                maxHeight = persons[i].getHeight();
                maxHeightName = persons[i].getName();
            }
        }
        System.out.println("Shortest height: " + minHeight + " | Name: " + minHeightName +
                "\nTallest height: " + maxHeight + " | Name: " + maxHeightName);
        System.out.println();

        //quantidade de homens
        int counterMale = 0;
        for (Person p : persons){
            if (p.getGender().equalsIgnoreCase("M")){
                counterMale++;
            }
        }
        System.out.println("Number of men: " + counterMale);
        System.out.println();

        //média altura mulheres
        int counterFemale = 0;
        double sumHeightFemale = 0;
        double averageHeightFemale = 0;
        for (Person person : persons){
            if (person.getGender().equalsIgnoreCase("F")){
                counterFemale++;
                sumHeightFemale += person.getHeight();
            }
        }
        averageHeightFemale = sumHeightFemale / counterFemale;
        System.out.printf("The average height: %.2f", averageHeightFemale);
        System.out.println("\n----------------------------------");

        sc.close();
    }
}
/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
Fazer um programa que calcule e escreva a maior e a menor altura do grupo,
a média de altura das mulheres, e o número de homens.
 */