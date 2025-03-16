package entities;

public class Product {
    protected String name;
    protected Double price;

    //constructors
    public Product(){}

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //methods
    public String priceTag(){
        return name + " $ " + String.format("%.2f", price);
    }

}
