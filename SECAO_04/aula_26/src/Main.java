import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String nome = sc.nextLine();
        System.out.println("Your name: " + nome);

        //sc.next - ler so a primeira palavra - sc.nextLine - ler a linha inteira
        /*ao usar qualquer sc. diferente do sc.nextLine, ele irá consumir o proximo sc.nextLine.
        Para isso nao acontecer, usa-se um sc.nextLine vazio.*/

    }
}