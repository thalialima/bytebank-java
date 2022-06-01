package model;

public class InternalSystem {
    private int password = 3333;

    public void authenticate(Authenticable authenticableEmployee) {
        if (authenticableEmployee.authenticate(this.password)) {
            System.out.println("Autenticação aceita.");
        } else {
            System.out.println("Não é possível entrar no sistema, senha incorreta!");
        }
    }
}
