package model;

public class Director extends Employee {
    private int password;

    public boolean authenticate(int password) {
        return this.password == password;
    }

    public double getBonus() {
            return super.getBonus() + super.getWage() + 100;
    }

    public void setPassword(int password){
        this.password = password;
    }

}
