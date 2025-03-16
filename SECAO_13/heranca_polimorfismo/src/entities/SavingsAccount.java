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

    @Override
    public final void withdraw(Double amount) { //saque
        this.balance -= amount;
    }
    //final para que nao possa ser mudado numa subclasse, a fim de proteger de possiveis erros.
    //Mas não é proibido, caso precise pode ser usado.
}
