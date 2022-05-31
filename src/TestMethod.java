
public class TestMethod {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(500);
        System.out.println("Valor depois do depósito: " + account.getBalance());

        account.withdraw(150);
        System.out.println("Valor depois do saque: " + account.getBalance());

        boolean w = account.withdraw(10000);
        System.out.println(w);

        Account thalia = new Account();
        thalia.deposit(100);
        System.out.println("Saldo de Thalia antes da transferência: " + thalia.getBalance());

        Account irene = new Account();
        System.out.println("Saldo de Irene antes da transferência: " + irene.getBalance());
        thalia.transfer(55, irene);

        System.out.println("Saldo de Thalia depois da transferêncaia: " + thalia.getBalance());
        System.out.println("Saldo de Irene depois da transferêncaia: " + irene.getBalance());

        Account newAccount = new Account();

        System.out.println(newAccount.getHolder().getName());
    }
}
