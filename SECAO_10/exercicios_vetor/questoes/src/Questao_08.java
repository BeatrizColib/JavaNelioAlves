import java.util.Scanner;

public class Questao_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        for (int i = 0; i <list.length; i++){
            System.out.print("Number: ");
            list[i] = sc.nextInt();
        }

        double evenSum = 0;
        int evenCount = 0;
        double evenAverage = 0;
        for (int num : list){
            if (num % 2 == 0 && num != 0){
                evenSum += num;
                evenCount++;
            }
        }
        evenAverage = evenSum/evenCount;
        if (evenSum > 0) {
            System.out.printf("Average of the even numbers: %.1f", evenAverage);
        } else {
            System.out.println("No even number was entered");
        }

        sc.close();
    }
}
/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */