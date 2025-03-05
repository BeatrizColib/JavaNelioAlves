import java.util.Scanner;

public class Questao_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        double[] numbers = new double[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number " + (i +1) + ": ");
            numbers[i] = sc.nextDouble();
        }
        System.out.println();

        double sum = 0;
        double average = 0;
        for (double num : numbers) {
            sum += num;
        }
        average = sum / numbers.length;
        System.out.printf("Average vector is: %.3f", average);
        System.out.println();
        System.out.println("Numbers below the average: ");
        for (double num : numbers) {
            if (num < average) {
                System.out.printf("%.1f | ", num);
            }
        }

        sc.close();
    }
}
/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais.
Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais.
Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa
decimal cada.
 */