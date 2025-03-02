package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //CONSTRUTOR VAZIO
        Product product01 = new Product();

        System.out.print("Name Product 01: ");
        String name01 = sc.nextLine();
        System.out.print("Price Product 01: ");
        double price01 = sc.nextDouble();
        System.out.print("Quantity Product 01: ");
        int quantity01 = sc.nextInt();
        System.out.println();

        product01.setName(name01);
        product01.setPrice(price01);
        product01.addProducts(quantity01);
        // product01.quantity = quantity01; - se fosse sem o encapsulamento

        System.out.println("Product 01: " + product01);
        System.out.println("---------------------------------------------");

        //CONSTRUTOR SO COM NOME/PRICE
        Product product02 = new Product("Camisa", 459.90);
        System.out.println("Product 02: " + product02);
        System.out.println("---------------------------------------------");

        //CONSTRUTOR CHEIO
        /* usando scanner e construtor preenchido:
           1 - pede as variaveis - tipo + nome + scanner
           2 - chama o construtor preenchendo com os atributos
        */
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        sc.nextLine(); //consumir quebra de linha pendente
        String name03 = sc.nextLine();
        System.out.print("Price: ");
        double price03 = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity03= sc.nextInt();
        System.out.println();

        Product product03 = new Product(name03, price03, quantity03);

        System.out.println("Product data: " + product03.getName());
        System.out.println("Price: $ " + String.format("%.2f", product03.getPrice()));
        System.out.println("Quantity: " + product03.getQuantity() + " units.");
        System.out.println("Total Value: $ " + String.format("%.2f", product03.totalValueInStock()));
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        quantity03 = sc.nextInt();
        product03.addProducts(quantity03);
        System.out.println();

        System.out.println("Updated data: " + product03);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity03 = sc.nextInt();
        product03.removeProducts(quantity03);
        System.out.println();

        System.out.println("Updated data: " + product03);
        System.out.println("-------------------------------------------------------");
        sc.close();
    }
}