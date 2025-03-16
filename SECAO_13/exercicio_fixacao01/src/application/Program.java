package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("How many numbers will you enter: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= quantity; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            String type = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if (type.equalsIgnoreCase("u")) {
                System.out.print("Manufacture date: (dd/MM/yyyy): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product product = new UsedProduct(name, price, date);
                products.add(product);
            } else if (type.equalsIgnoreCase("i")){
                System.out.print("Customs fee: ");
                Double fee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, fee);
                products.add(product);
            } else if (type.equalsIgnoreCase("c")) {
                products.add(new Product(name,price));
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product p : products){
            System.out.println(p.priceTag());
        }


        sc.close();
    }
}
