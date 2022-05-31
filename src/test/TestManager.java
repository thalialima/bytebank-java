package test;

import model.Manager;

public class TestManager {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.setName("Jolyne");
        manager.setCPF("456.741.852-25");
        manager.setWage(3500.00);

        System.out.println(manager);
        manager.setPassword(123456);

        boolean authenticate = manager.authenticate(123456);
        System.out.println(authenticate);

    }
}
