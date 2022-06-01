package test;

import model.Administrator;
import model.InternalSystem;
import model.Manager;

public class TestInternalSystem {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Thalia");
        manager.setPassword(3337);

        InternalSystem is = new InternalSystem();
        is.authenticate(manager);

        Administrator administrator = new Administrator();
        administrator.setName("Irene");
        administrator.setPassword(3333);

        is.authenticate(administrator);
    }
}
