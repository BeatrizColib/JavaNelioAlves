import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("What is the lenght of the array? ");
        int lenghtArray = sc.nextInt();

        double[] array = new double[lenghtArray];
        for (int i = 0; i<lenghtArray; i++){
            System.out.print("Enter the " + i + "th number: ");
            array[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i<lenghtArray; i++){
            sum += array[i];
        }
        double average = sum/lenghtArray;

        System.out.printf("the average of the array is: %.2f", average);
    }
}
