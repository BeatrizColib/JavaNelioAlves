package application;

import entities.Order;
import enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(509, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.PROCESSING;
        System.out.println(os1);
        OrderStatus os2 = OrderStatus.valueOf("PROCESSING");
        System.out.println(os2);

    }
}
