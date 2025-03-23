package entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    //constructors
    public Individual() {
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    //get and set
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    //method
    @Override
    public Double tax(){
        Double tax = 0.0;
        if (anualIncome >= 20000){
            tax = anualIncome * 0.25 - (healthExpenditures * 0.5);
        } else if (anualIncome < 20000) {
            tax = anualIncome * 0.15 - (healthExpenditures * 0.5);
        }
        return tax;
    }

    @Override
    public String toString() {
        return name + ": $ " + String.format("%.2f", tax());
    }

}
