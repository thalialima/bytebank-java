package model;

public class Administrator extends Employee implements Authenticable {

    private int password;

    @Override
    public double getBonus() {
        return 50;
    }

    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean authenticate(int password) {
        return this.password == password;
    }
}
