package test;

import model.CheckingAccount;
import model.LifeInsurance;
import model.TaxCalculator;

public class TestTaxCalculator {
    public static void main(String[] args) {
        LifeInsurance lifeInsurance = new LifeInsurance();

        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.calculateTax(lifeInsurance);

        CheckingAccount checkingAccount = new CheckingAccount();

        checkingAccount.deposit(50000);
        taxCalculator.calculateTax(checkingAccount);
    }
}
