import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the matriz: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[][] nomeMatriz = new int[n][n];

        System.out.println("Enter the values of the matriz: ");
        for (int i = 0; i < nomeMatriz.length; i++) {    //pode ser i < [n] e embaixo j < [n], mas .lenght é mais usado
            for (int j = 0; j < nomeMatriz[i].length; j++) {
                System.out.print("Line - " + i + " Column - " + j + ": ");
                nomeMatriz[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("The matriz is: ");
        for (int i = 0; i < nomeMatriz.length; i++) {
            for (int j = 0; j < nomeMatriz[i].length; j++) {
                System.out.print(nomeMatriz[i][j] + " ");
            }
            System.out.println();
        }

        //linha diagonal
        System.out.println("\nDiagonal Main: ");
        for (int i = 0; i < nomeMatriz.length; i++) {
            System.out.print(nomeMatriz[i][i] + " ");
        }
        System.out.println();

        //Negative numbers
        int counterNegative = 0;
        List<Integer> negatives = new ArrayList<>();
                for (int i = 0; i < nomeMatriz.length; i++) {
            for (int j = 0; j < nomeMatriz[i].length; j++) {
                if (nomeMatriz[i][j] < 0) {
                    counterNegative++;
                    negatives.add(nomeMatriz[i][j]);
                }
            }
        }
        System.out.println("\nNegative numbers: " +
                "\nNegatives: " + counterNegative +
                "\nNegative numbers: " + negatives);

        sc.close();
    }
}