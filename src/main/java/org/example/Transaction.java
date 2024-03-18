package org.example;

public class Transaction {
    private int id;
    private double amount;
    private String type; // e.g., "deposit", "withdrawal"
    private String date;
    private Account account; // The account involved in the transaction
    private Customer customer; // The customer who initiated the transaction


    // Constructors
    public Transaction() {
    }

    public Transaction(int id, double amount, String type, String date, Account account, Customer customer) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.account = account;
        this.customer = customer;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Additional method stubs
    public void processTransaction() {
        System.out.println("Placeholder for processing Transactions");
    }


    public void fetchAssociatedAccounts() {
        System.out.println("Placeholder for fetching accounts");
    }
}

