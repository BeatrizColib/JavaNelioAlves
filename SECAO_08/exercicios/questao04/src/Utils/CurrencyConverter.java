package Utils;

public class CurrencyConverter {
    public static final double TAX_RATE = 0.06; //6% iof

    public static double convert(double dollarPrice, double amount){
        double total = dollarPrice * amount;
        return total + (total * TAX_RATE);
    }
}
