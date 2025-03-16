package entities;

public class ImportedProduct extends Product {
    private Double customsFee; //taxa da alfândega

    //constructors
    public ImportedProduct() {}

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    //get and set
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    //methods
    public Double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag(){
        return getName() + " $ " + totalPrice() + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }
}
