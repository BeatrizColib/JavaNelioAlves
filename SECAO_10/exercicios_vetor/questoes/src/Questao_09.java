import java.util.Scanner;

public class Questao_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will you enter: ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] names = new String[size];
        int[] ages = new int[size];

        System.out.println("Enter the information of the people: ");
        for(int i = 0; i < size; i++) {
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            sc.nextLine();
        }

        int maxAge = ages[0];
        int indexAge = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages [i] > maxAge) {
                maxAge = ages[i];
                indexAge = i;
            }
        }

        System.out.println("The oldest person is " + names[indexAge] + "with" + maxAge + "years old.");

        sc.close();
    }
}
/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades.
Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor.
Depois, mostrar na tela o nome da pessoa mais velha.
 */