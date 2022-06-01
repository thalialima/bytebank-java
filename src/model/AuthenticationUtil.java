package model;

public class AuthenticationUtil {
    private int password;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public boolean authenticate(int password) {
        return this.password == password;
    }
}
