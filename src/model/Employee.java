package model;

public class Employee {

    private String name;
    private String CPF;
    protected double wage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Name = '" + name + '\'' +
                ", CPF = '" + CPF + '\'' +
                ", Wage = " + wage;
    }

}
