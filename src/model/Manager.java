package model;

import model.Employee;

public class Manager extends Employee {
    private int password;

    public boolean authenticate(int password) {
        return this.password == password;
    }

    public double getBonus() {
            return super.getWage();
    }

    public void setPassword(int password){
        this.password = password;
    }

}
