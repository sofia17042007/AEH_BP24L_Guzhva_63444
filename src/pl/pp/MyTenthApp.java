package pl.pp;

public class MyTenthApp {
    public static void main(String[] args) {
        Account myAccount = new Account();

        myAccount.setAccountNumber("123456789");
        myAccount.setBalance(1000.0);
        myAccount.setCustomerName("Evie Sage");
        myAccount.setEmail("evie@example.com");
        myAccount.setPhoneNumber("123-456-789");

        myAccount.withdraw(900.0);
        myAccount.deposit(250.0);
        myAccount.withdraw(50.0);
        myAccount.withdraw(500.0);
    }
}