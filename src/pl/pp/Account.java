package pl.pp;


public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Геттеры и сеттеры
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // Методы операций
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Депозит " + amount + " успешен. Новый баланс: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Снятие " + amount + " успешно. Остаток: " + balance);
        } else {
            System.out.println("Недостаточно средств. Попытка снять: " + amount + ", доступно: " + balance);
        }
    }
}