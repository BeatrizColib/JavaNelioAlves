import java.util.Locale;
import java.util.Scanner;

public class Questao_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter: ");
        int length = sc.nextInt();
        double[] numbers = new double[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number " + (i + 1) + ": ");
            numbers[i] = sc.nextDouble();
        }
        System.out.println();

        System.out.print("Values entered = ");
        for (double num : numbers) {
            System.out.print(num + " | ");
        }
        System.out.println();

        double sum=0;
        for (double num : numbers) {
            sum += num;
        }
        System.out.printf("The sum of the numbers is = %.2f", sum);
        System.out.println();

        double average = sum/numbers.length;
        System.out.printf("Average is = %.2f", average);

        sc.close();
    }
}
/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */