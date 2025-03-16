package entities;

public class OutsourceEmployee extends Employee {
    private Double additionalCharge;


    //constructors
    public OutsourceEmployee() {super();}

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    //get and set
    public Double getAdditional() {
        return additionalCharge;
    }

    public void setAdditional(Double additional) {
        this.additionalCharge = additional;
    }

    //methods
    @Override
    public Double payment(){
        return super.payment() + (additionalCharge * 1.1);
    }

    @Override
    public String toString(){
        return super.name + " - $ " + String.format("%.2f", payment());
    }
}
