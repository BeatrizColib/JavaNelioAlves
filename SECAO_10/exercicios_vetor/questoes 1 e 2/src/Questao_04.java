import java.util.Locale;
import java.util.Scanner;

public class Questao_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many integer numbers will you enter: ");
        int quantity = sc.nextInt();
        int[] numbers = new int[quantity];

        for(int i = 0; i < quantity; i++){
            System.out.print("Enter a number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int evenCounter = 0;
        boolean hasEven = false;
        //primeiro verifica se tem algum par
        for(int n : numbers){
            if(n % 2 == 0){
                hasEven = true;
                break;
            }
        }

        if (hasEven) {
            System.out.println("Even numbers: ");
            for (int n : numbers){
                if (n % 2 ==0) {
                    System.out.print(n + " | ");
                    evenCounter++;
                }
            }
            System.out.println();
            System.out.println("Quantity of even numbers: " + evenCounter);

        } else {
            System.out.println("No even numbers were entered!");
        }
        sc.close();
    }
}
/*
Faça um programa que leia N números inteiros e armazene-os em um vetor.
Em seguida, mostre na tela todos os números pares, e também a quantidade
de números pares.

even number - numero par
odd number - numero impar
 */

