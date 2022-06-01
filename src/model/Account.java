package model;

public abstract class Account {
    private double balance;
    private int branch;
    private int number;
    private Client holder = new Client();
    private static int total = 0;

    public Account() {

    }
    public Account(int branch, int number) {
        this.branch = branch;
        this.number = number;
        Account.total++;
        System.out.println("O total de contas é: " + Account.total);
        System.out.println("Estou criando a conta: " + this.number);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getBranch() {
        return branch;
    }

    public int getNumber() {
        return number;
    }

    public Client getHolder() {
        return holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public boolean withdraw(double value) {
        if (value > this.balance)
            return false;

        this.balance -= value;
        return true;
    }
    public abstract void deposit(double value);
    public boolean transfer(double value, Account toAccount) {
        if(!this.withdraw(value))
            return false;
        toAccount.deposit(value);
        return true;
    }

    public static int getTotal() {
        return Account.total;
    }
}
