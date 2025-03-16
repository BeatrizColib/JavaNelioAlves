package entities;

public class BusinessAccount extends Account {
    private Double loanLimit; //emprestimo

    //constructors
    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }
    //get and set
    public Double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    //methods
    public void loan(Double amount) {
        if(amount <= loanLimit) {
            balance += amount - 10;
        }
    }
    @Override
    public final void withdraw(Double amount) {
        super.withdraw(amount);          //super pega da classe mae o metodo
        balance -= 5;
    }
}
