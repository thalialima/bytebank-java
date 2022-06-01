package test;

import model.CheckingAccount;
import model.SavingsAccount;

public class TestAccounts {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(111, 111);
        checkingAccount.deposit(100);

        SavingsAccount savingsAccount = new SavingsAccount(222, 222);
        savingsAccount.deposit(200);

        System.out.println("Saldo CC: " + checkingAccount.getBalance());
        checkingAccount.transfer(10,savingsAccount);
        System.out.println("Saldo CC: " + checkingAccount.getBalance());
        System.out.println("Saldo CP: " + savingsAccount.getBalance());
    }



}
