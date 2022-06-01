package model;

public class CheckingAccount extends Account {
    public CheckingAccount(int branch, int number) {
        super(branch, number);
    }

    public CheckingAccount() {

    }

    @Override
    public boolean withdraw(double value) {
        return super.withdraw(value + 0.1);
    }

    @Override
    public void deposit(double value) {
        double balance = super.getBalance();
        super.setBalance(balance + value);
    }
}
