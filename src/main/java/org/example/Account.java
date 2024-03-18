package org.example;

public class Account {
    private Customer customer;
    private double accountBalance;

    public Account(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setBalance(int i) {
    }

    public void deposit(int i) {
    }

    public double getBalance() {
        return accountBalance;
    }

    public void withdraw(int i) {
    }
}

