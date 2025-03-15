package entities;

import enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client; //vai atribuir que todo pedido tem um cliente atrelado
    //order items list
    private List <OrderItem> items = new ArrayList<>();

    //StringBuilder
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    //constructors
    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    } //nao coloca coleçao(lista), recomendado colocar os tipos unicos

    //getters and setters
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    //sem get e set da lista para protegê-la

    //methods
    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }
    public Double total(){
        Double total = 0.0;
        for (OrderItem item : items){
            total += item.subTotal();
        }
        return total;
    }

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY:");
        sb.append("\nOrder moment: "+ sdf.format(moment));
        sb.append("\nOrder Status: " + status);
        sb.append("\nClient: " + client);

        sb.append("\nOrder items: ");
        for (OrderItem i :items) {
            sb.append("\n" + i);
        }
        sb.append("\nTotal price: $" + String.format("%.2f",total()));
        return sb.toString();
    }
}
