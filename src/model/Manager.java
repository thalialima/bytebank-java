package model;

public class Manager extends Employee implements Authenticable {

    private int passsword;

    public double getBonus() {
            return super.getWage();
    }

    @Override
    public void setPassword(int password) {
        this.passsword = password;
    }

    @Override
    public boolean authenticate(int password) {
        return this.passsword == password;
    }
}
