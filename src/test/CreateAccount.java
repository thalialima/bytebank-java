package test;

import model.Account;
import model.CheckingAccount;
import model.SavingsAccount;

public class CreateAccount {

    public static void main(String[] args) {
        Account firstAccount = new CheckingAccount();
        firstAccount.setBalance(100);
        System.out.println(firstAccount.getBalance());

        firstAccount.setBalance(100);
        System.out.println(firstAccount.getBalance());

        Account secondAccount = new SavingsAccount();

        secondAccount.setBalance(50);
        System.out.println("Primeira conta tem: " + firstAccount.getBalance());
        System.out.println("Segunda conta tem: " + secondAccount.getBalance());

        Account thirdAccount = new CheckingAccount(1332, 21345);
        System.out.println("Agência da terceira conta:" + thirdAccount.getBranch());
        System.out.println("Número de contas criadas: " + Account.getTotal());

        Account fourthAccount = new SavingsAccount(1442, 21445);
        System.out.println("Agência da quarta conta:" + fourthAccount.getBranch());
        System.out.println("Número de contas criadas: " + Account.getTotal());
    }
}
