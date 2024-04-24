package BankApplication;

public class Administrator implements Comparable<Administrator> { // setting up the administrator class
    private int adminID;
    private String name;
    private String email;
    private String password;
    private long creationTime;
    private double adminBalance;


    public Administrator() {
    }

    public Administrator(int adminID, String name, String email, String password, double balance) {
        this.adminID = adminID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.creationTime = System.currentTimeMillis();
        this.adminBalance = balance;
    }

    // Getters
    public int getAdminID() {
        return adminID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public double getAdminBalance() {
        return adminBalance;
    }

    public void setAdminBalance(double adminBalance) {
        this.adminBalance = adminBalance;
    }
    public long getCreationTime() {
        return creationTime;
    }
    @Override
    public int compareTo(Administrator other) {
        if (this.adminBalance > other.adminBalance) {
            return -1;
        } else if (this.adminBalance < other.adminBalance) {
            return 1;
        }
        return Long.compare(other.creationTime, this.creationTime);
    }
}
