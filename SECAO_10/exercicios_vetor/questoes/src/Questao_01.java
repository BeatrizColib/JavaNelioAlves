import java.util.Locale;
import java.util.Scanner;

public class Questao_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int length;

        do {
            System.out.print("How many numbers will you enter (maximum 10): ");
            length = sc.nextInt();

            if (length < 1 || length > 10) {
                System.out.println("The number must be between 1 and 10. Please try again.");
            }

        } while (length < 1 || length > 10);

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Negative numbers entered: ");
        for (int num : numbers) {
            if (num < 0) {
                System.out.print(num + " | ");
            }
        }

        sc.close();
    }
}

/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N
números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os
números negativos lidos.
 */