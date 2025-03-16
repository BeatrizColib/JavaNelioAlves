package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    //constructors
    public UsedProduct() {}

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    //get and set
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    //methods
    @Override
    public String priceTag(){
        return name + " (used) $ " + getPrice() + " (Manufacture date: " + manufactureDate + ")";
    }

}
