public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account("123456789", 1000.00, "Bob Brown", "email@bob.com", "123-456-7890");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawFunds(1000.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getNumber() +"; name " + timsAccount.getCustomerName());
    }
}
