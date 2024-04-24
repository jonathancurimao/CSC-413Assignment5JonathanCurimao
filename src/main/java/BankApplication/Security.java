package BankApplication;

public class Security implements Comparable<Security> {
    private int id;
    private String name;
    private double securityBalance;
    private long creationTime;

    public Security(){

    }


    public Security (int id, String name, double securityBalance) {
        this.id = id;
        this.name = name;
        this.securityBalance = securityBalance;
        this.creationTime = System.currentTimeMillis();
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return securityBalance;
    }

    public long getCreationTime() {
        return creationTime;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.securityBalance = balance;
    }

    // Implementing Comparable interface
    @Override
    public int compareTo(Security other) {
        // Sort by balance in descending order
        if (this.securityBalance > other.securityBalance) {
            return -1; // Higher balance means higher priority
        } else if (this.securityBalance < other.securityBalance) {
            return 1;
        }

        // If balances are equal, sort by creation time
        return Long.compare(other.creationTime, this.creationTime);
    }
}
