package model;

public class Client implements Authenticable {
    private String name;
    private String CPF;
    private int age;

    private final AuthenticationUtil authentication;

    public Client(){
        this.authentication = new AuthenticationUtil();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
