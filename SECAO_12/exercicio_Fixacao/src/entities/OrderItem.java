package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product; //cada orderitem tem um product associado

    //constructor
    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    //getters and setters
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    //methods
    public Double subTotal() {
        return price * quantity;
    }

    //toString
    @Override
    public String toString() {
        return getProduct().getName() + ", $" + String.format("%.2f", price) +
                ", Quantity: " + quantity + ", Subtotal: $" + String.format("%.2f", subTotal());
    }
}
