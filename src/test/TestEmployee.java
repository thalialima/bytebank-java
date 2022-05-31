package test;

import model.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Thalia");
        employee.setCPF("456.456.789-85");
        employee.setWage(1000.00);

        System.out.println(employee);

        Employee manager = new Employee();

        manager.setName("Irene");
        manager.setCPF("789.123.741-83");
        manager.setWage(1000.00);

        System.out.println(manager);
    }
}
