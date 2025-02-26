package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock(){
        return price * quantity;
    };

    public void AddProducts(int quantity) {
        this.quantity += quantity;
        //this é uma palavra reservada que  se autorefere ao objeto - atributo da classe e
        //nao ao que vai receber o do parametro
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return "Product: " + name +
                ", R$ " + String.format("%.2f", price) + ", " +
                quantity + " units, " +
                "Total: R$ " + String.format("%.2f", TotalValueInStock());
    }
}
