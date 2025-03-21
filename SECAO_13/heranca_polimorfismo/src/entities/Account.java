package entities;

public class Account {
    protected Integer number;
    protected String holder; //titular
    protected Double balance; //saldo

    public Account() {}

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void withdraw(Double amount) { //saque
        this.balance -= amount +5;
    }
    public void deposit(Double amount) {
        this.balance += amount;
    }
}
