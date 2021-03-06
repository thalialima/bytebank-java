package model;

import java.security.PublicKey;

public class SavingsAccount extends Account {

    public SavingsAccount(int branch, int number) {
        super(branch, number);
    }

    public SavingsAccount() {

    }

    @Override
    public void deposit(double value) {
        double balance = super.getBalance();
        super.setBalance(balance + value);
    }
}
