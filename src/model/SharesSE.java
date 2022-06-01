package model;

public class SharesSE implements Taxable {

    private double  taxValue;

    @Override
    public double getTaxValue() {
        return this.taxValue;
    }
}
