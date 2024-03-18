package org.example;

public class User { // for JSON data
    private String name;
    private String email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // some method stubs for user
    public void fetchUserData() {
        System.out.println("FIXME: Finish fetchUserData()");
    }

    public void fetchAssociatedTransactions() {
        System.out.println("FIXME: Finish fetchAssociatedTransactions()");
    }

    @Override
    public String toString() {
        return "User object with name '" + name + "' and email " + email;
    }
}

