public class Account {
    private double balance;
    private int branch;
    private int number;
    private Client holder = new Client();
    private static int total;

    public Account() {

    }
    public Account(int branch, int number) {
        this.branch = branch;
        this.number = number;
        Account.total++;
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
    public void deposit(double value) {
        this.balance += value;
    }
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
