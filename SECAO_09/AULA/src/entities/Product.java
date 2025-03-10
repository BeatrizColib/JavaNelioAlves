package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    //CONSTRUTORES
    public Product(){
        //construtor vazio
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        //construtor que possibilita o cadastro de um produto sem dizer a quantidade inicial
        //por padrao, sera tipo como 0 em quantity
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    } //nao criei o setQuantity, para protegê-lo de mudanças indesejadas. Ele so sera att atraves dos metodos criados p/ tal

    //MÉTODOS
    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    //TOSTRING
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}