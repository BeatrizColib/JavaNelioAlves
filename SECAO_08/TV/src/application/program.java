package application;
import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Product product = new Product();

        System.out.print("Enter the name of the product: ");
        product.name = sc.nextLine();
        System.out.print("Enter the price of the product: ");
        product.price = sc.nextDouble();
        System.out.print("Enter the quantity of the product: ");
        product.quantity = sc.nextInt();

        System.out.println(product.toString());
        System.out.println();
        //System.out.println(product); - forma abreviada

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println("Update: " + product);//equivale a => System.out.println(product.toString());
        System.out.println();

        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);
        System.out.println("Update: " + product);

        sc.close();
    }
}
