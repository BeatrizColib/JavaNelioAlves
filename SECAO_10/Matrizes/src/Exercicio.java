import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers of lines: ");
        int lines = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[lines][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Line " + i + " - Number: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        //print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the number for the search: ");
        int search = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == search) {
                    System.out.println("Position: [" + i + "," + j + "]");

                    if (j > 0) {System.out.println("Left number: " + matrix[i][j-1]);}
                    if (j < matrix[i].length - 1) {System.out.println("Right number: " + matrix[i][j + 1]);}
                    if (i > 0) {System.out.println("Up number: " + matrix[i - 1][j]);}
                    if (i < matrix.length - 1) {System.out.println("Down number: " + matrix[i + 1][j]);}
                }
            }
        }
    }
}
