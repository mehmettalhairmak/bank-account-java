public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();

        bobsAccount.setNumber("123456789");
        bobsAccount.setBalance(1000.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("myemail@bob.com");
        bobsAccount.setCustomerPhone("123-456-7890");

        bobsAccount.withdrawFunds(1000.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);
    }
}
