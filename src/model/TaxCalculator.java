package model;

public class TaxCalculator {
    private double taxSum;

    public TaxCalculator(){
        this.taxSum = 0;
    }

    public void calculateTax(Taxable taxable) {
        this.taxSum += taxable.getTaxValue();
        System.out.println("Tax value: " + this.taxSum);
    }
}
