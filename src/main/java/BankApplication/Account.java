package BankApplication;

public class Account {
    private Customer customer;
    private String accountNumber;
    private double accountBalance;

    public Account(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setBalance(double i) {
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
        System.out.println("Deposited: " + amount);
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void withdraw(double amount) {
        if (this.accountBalance >= amount) {
            this.accountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

