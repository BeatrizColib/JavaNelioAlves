package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(1001,"Bia", 500.00);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Julio", 9500.00, 15000.00);

        //Upcasting
        Account acc1 = businessAccount;
        Account acc2 = new BusinessAccount(1003, "Laura", 600.5, 8500.00);
        Account acc3 = new SavingsAccount(1004, "Helena", 650.9, 1.50);

        //Downcasting
        //acc2.loan() -> ele dá erro, pq a acc2 ainda é tipo account
        BusinessAccount acc4 = (BusinessAccount)acc2; // nao posso apenas colocar =acc2, ele reclama pq apesar de acc2 ter sido atribuida mais acima a uma busAccount, ela ainda era uma account. Entao para "forçar" e o compilador nao reclamar, se escreve desse jeito
        acc4.loan(150.0);

        // nem sempre o compilador vai reclamar de um downcasting errado, mas na hora de executar, dará erro, por exemplo, tal forma nao é permitida:
        //BusinessAccount acc5 = (BusinessAccount)acc3;
        //para isso devemos testar e usar o instanceof = instancia de

        if (acc3 instanceof BusinessAccount){ //"se acc3 for uma instancia de BusAcc..."
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(500.0);
            System.out.println("Loan successful");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Balance updated!");
        }
    }
}