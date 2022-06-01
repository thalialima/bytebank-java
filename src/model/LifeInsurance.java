package model;

public class LifeInsurance implements Taxable {
    private double taxValue;

    public LifeInsurance() {
        this.taxValue = 42.00;
    }

    @Override
    public double getTaxValue() {
        return taxValue;
    }
}
