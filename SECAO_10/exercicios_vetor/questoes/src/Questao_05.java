import java.util.Locale;
import java.util.Scanner;

public class Questao_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many real numbers will you enter: ");
        int quantity = sc.nextInt();
        double[] numbers = new double[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a real number: ");
            numbers[i] = sc.nextDouble();
        }
        System.out.println();

        double maxNumber = numbers[0];
        int maxIndex = 0;

        for(int i=0; i< numbers.length;i++){
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println("The max number is " + maxNumber+
                "\nIts index is: " + maxIndex + "º.");

        sc.close();
    }
}

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida,
mostrar na tela o maior número do vetor (supor não haver empates).
Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero).
 */