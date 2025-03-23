package entities;

public class Company extends TaxPayer{
    private int numberOfEmployees;

    //constructors
    public Company() {
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    //get and set
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    //method
    @Override
    public Double tax(){
        Double tax = 0.0;
        if(numberOfEmployees > 10){
            tax = anualIncome * 0.14;
        } else if(numberOfEmployees <= 10) {
            tax = anualIncome * 0.16;
        }
        return tax;
    }
    @Override
    public String toString() {
        return name + ": $ " + String.format("%.2f", tax());
    }
}
