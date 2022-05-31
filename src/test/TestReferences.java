package test;

import model.BonusControl;
import model.Director;
import model.Employee;
import model.Manager;

public class TestReferences {

    public static void main(String[] args) {
        Employee manager = new Manager();
        manager.setName("Nico");

        System.out.println(manager.getName());

        Director director = new Director();
        director.setWage(5000);

        BonusControl control = new BonusControl();
        control.registrate(director);

        System.out.println(control.getSum());
    }
}
