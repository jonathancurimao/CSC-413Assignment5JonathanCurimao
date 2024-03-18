package org.example;

import java.util.ArrayList;
import java.util.List;


public class Customer implements Comparable<Customer> {
    private List<Account> accounts;
    private long creationTime;
    private double balance;
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Address address;


    public Customer() {
        this.creationTime = System.currentTimeMillis();
        this.accounts = new ArrayList<>();
    }
    public void addAccount(Account account) { // for when a customer may have more than 1 account
        this.accounts.add(account);
    }
    public List<Account> getAccounts() {
        return accounts;
    }


    public Customer(int id, String firstName, String lastName, String email, String phone, Address address, double balance) {
        this.balance = balance;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    // Getters


    public long getCreationTime() {
        return creationTime;
    }

    public double getBalance() {
        return balance;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    // Setters
    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public int compareTo (Customer other) {
        if (this.balance > other.balance) {
            return -1;
        } else if (this.balance < other.balance) {
            return 1;
        }

        return Long.compare(other.creationTime, this.creationTime);
    }
    // customer method stubs
    public void fetchCustomerData() {
        System.out.println("Placeholder for fetching customer data");
    }
    public void fetchAssociatedAccounts() {
        System.out.println("Placeholder for fetching associated accounts with the customer");
    }
    public void fetchAssociatedSecurities() {
        System.out.println("Placeholder for security fetch");
    }
}
