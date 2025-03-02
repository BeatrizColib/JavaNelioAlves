package entities;

public class BankAccount {
    private final int accountNumber; //tem que ter o construtor para nao dar erro, pois o final deve ser inicializado
    private String name;
    private double deposit;

    //para o final accountNumber
    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //CONSTRUTORES
    public BankAccount(int accountNumber, String name, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        depositInAccount(initialDeposit); //fará o deposito inicial atraves do metedo de deposito
    }

    //GETTERS AND SETTERS
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    //METHODS
    public double depositInAccount(double amount) {
        return this.deposit += amount;
    }

    /*
    poderia ser tambem:
    public void depositInAccount(double amount){
        deposit += amount;
    }
     */

    public double withdrawInAccount(double amount) {
        return this.deposit -= amount + 5; //cada saque tem custo de R$ 5, se colocar (-5) como ja tem o menos antes, ficaria somando: - com - = +
    }

    //SHOW RESULTS
    @Override
    public String toString() {
        return "Account " + this.accountNumber + ", Holder: " + name + ", Balance: $ " + deposit + "\n";
    }
}
