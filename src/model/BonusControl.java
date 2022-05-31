package model;

public class BonusControl {
    private double sum;

    public double registrate(Employee e) {
        return this.sum += e.getBonus();
    }

    public double getSum() {
        return sum;
    }
}
