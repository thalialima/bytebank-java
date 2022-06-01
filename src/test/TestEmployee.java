package test;

import model.Director;
import model.Employee;
import model.Manager;

public class TestEmployee {
    public static void main(String[] args) {
        Employee director = new Director();

        director.setName("Thalia");
        director.setCPF("456.456.789-85");
        director.setWage(1000.00);

        System.out.println(director);

        Employee manager = new Manager();

        manager.setName("Irene");
        manager.setCPF("789.123.741-83");
        manager.setWage(1000.00);

        System.out.println(manager);
    }
}
