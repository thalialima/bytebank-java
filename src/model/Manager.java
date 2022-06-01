package model;

public class Manager extends Employee implements Authenticable {

    private final AuthenticationUtil authentication;

    public Manager() {
        this.authentication = new AuthenticationUtil();
    }

    public double getBonus() {
            return super.getWage();
    }

    @Override
    public void setPassword(int password) {
        this.authentication.setPassword(password);
    }

    @Override
    public boolean authenticate(int password) {
        return this.authentication.getPassword() == password;
    }
}
