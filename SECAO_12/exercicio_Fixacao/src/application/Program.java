package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

        //Customer registration
        System.out.println("Enter costumer data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date: (DD/MM/YYYY): ");
        String birthdate = sc.nextLine();

        //Instantiating a customer
        Client client01 = new Client(name, email, sdf2.parse(birthdate));

        //Instantiating order
        Order orderClient01 = new Order(new Date(), OrderStatus.PROCESSING, client01);

        //Sale registration
        System.out.println("Enter order data: ");
        System.out.print("Enter how many items are in the order: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= quantity; i++) {
            System.out.println("Enter the #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            sc.nextLine();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();

            //Instantiating Product, OrderItem
            Product product = new Product(productName, productPrice); //criei o produto
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product); //associo o produto, com preço e quantidade ao orderItem
            orderItem.subTotal();
            orderClient01.addItem(orderItem); //associa o item ao pedido
        }
        orderClient01.total();

        //Order sumary
        System.out.println(orderClient01);

        sc.close();
    }
}
