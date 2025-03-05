import java.util.Locale;
import java.util.Scanner;

public class Questao_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What sizes should the vectors have? ");
        int size = sc.nextInt();

        double[] vectorA = new double[size];
        System.out.println("Enter the numbers of the VectorA: ");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("Number: ");
            vectorA[i] = sc.nextDouble();
        }

        double[] vectorB = new double[size];
        System.out.println("Enter the numbers of the VectorB: ");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.print("Number: ");
            vectorB[i] = sc.nextDouble();
        }

        double[] vectorC = new double[size];
        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        System.out.println("The vectorC is: ");
        for (double num : vectorC){
            System.out.print(num + " | ");
        }
    }
}

/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada.
Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos
correspondentes de A e B. Imprima o vetor C gerado.
 */