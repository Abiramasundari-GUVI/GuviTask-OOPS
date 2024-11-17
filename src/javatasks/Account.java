package javatasks;
public class Account {
    // Data members
    private String account_Number;
    private double balance;

    // No-argument constructor
    public Account() {
        this.account_Number = "Unknown";
        this.balance = 0.0;
    }
    // Two-argument constructor
    public Account(String accountNumber, double initialBalance) {
        this.account_Number = accountNumber;
        this.balance = initialBalance;
    }
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: (Rs)" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: (Rs)" + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }
    // Method to check balance
    public void checkBalance() {
        System.out.println("Current balance: (Rs)" + balance);
    }
    // Main method to test the Account class
    public static void main(String[] args) {
        // Creating an account with no-argument constructor
        Account account1 = new Account();
        account1.checkBalance();  // Should display initial balance of 0.0
        account1.deposit(500);
        account1.checkBalance();
        account1.withdraw(200);
        account1.checkBalance();

        // Creating an account with two-argument constructor
        Account account2 = new Account("123456789", 1000.0);
        account2.checkBalance();  // Should display initial balance of 1000.0
        account2.deposit(300);
        account2.checkBalance();
        account2.withdraw(1500);  // Should display insufficient funds
        account2.withdraw(800);
        account2.checkBalance();
    }
}
