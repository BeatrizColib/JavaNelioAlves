package application;
import entities.Rectangle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("___Let's calculate the data of a rectangle___");
        System.out.print("Enter the witdh value: ");
        double w = sc.nextDouble();
        System.out.print("Enter the height: ");
        double h = sc.nextDouble();

        //criação de objeto e atribuição de valores
        Rectangle rectangle01 = new Rectangle();
        rectangle01.width = w;
        rectangle01.height = h;

        rectangle01.calculateArea();
        rectangle01.calculatePerimeter();
        rectangle01.calculateDiagonal();

        System.out.println(rectangle01); //toString

        sc.close();
    }
}
