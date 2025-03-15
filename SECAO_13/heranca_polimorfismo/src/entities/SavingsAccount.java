package entities;

public class SavingsAccount extends Account {
    private Double interestRate; //juros

    //constructors
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    //get and set
    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    //methods
    public void updateBalance(){
        balance += interestRate * balance;
    }
}
