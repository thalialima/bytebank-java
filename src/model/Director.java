package model;

public class Director extends Employee implements Authenticable {

    private final AuthenticationUtil authentication;

    public Director(){
        this.authentication = new AuthenticationUtil();
    }

    @Override
    public boolean authenticate(int password) {
        return this.authentication.getPassword() == password;
    }

    public double getBonus() {
        return super.getWage() + 100;
    }

    @Override
    public void setPassword(int password) {
        this.authentication.setPassword(password);
    }

}
