public class CreateAccount {

    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.setBalance(100);
        System.out.println(firstAccount.getBalance());

        firstAccount.setBalance(100);
        System.out.println(firstAccount.getBalance());

        Account secondAccount = new Account();

        secondAccount.setBalance(50);
        System.out.println("Primeira conta tem: " + firstAccount.getBalance());
        System.out.println("Segunda conta tem: " + secondAccount.getBalance());

        Account thirdAccount = new Account(1332, 21345);
        System.out.println("Agência da terceira conta:" + thirdAccount.getBranch());
        System.out.println("Número de contas criadas: " + Account.getTotal());

        Account fourthAccount = new Account(1442, 21445);
        System.out.println("Agência da quarta conta:" + fourthAccount.getBranch());
        System.out.println("Número de contas criadas: " + Account.getTotal());
    }
}
