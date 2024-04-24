package BankApplication;

public class Teller implements Comparable<Teller> { // setting up the org.example.Customer user class

    private String username;
    private String email;
    private String phone;
    private char sex;
    private String birthday;
    private int id;
    private double tellerBalance;
    private long creationTime;



    public Teller(int identity, String username, String email, String ph, double tellerBalance, long creationTime) {
        this.username = username;
        this.email = email;
        this.phone = ph;
        this.id = identity;
        this.tellerBalance = tellerBalance;
        this.creationTime = creationTime;
    }

    // Getter and Setter methods
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getID() {
        return id;
    }

    public void setID(int idNum) {
        this.id = idNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String ph) {
        this.phone = ph;
    }

    public void setSex(char aChar) {
        this.sex = aChar;
    }

    public int getSex() {
        return sex;
    }

    public void setBirthday(String b) {
        this.birthday = b;
    }

    public String getBirthday() {
        return birthday;
    }
    public double getTellerBalance() {
        return tellerBalance;
    }
    public void setTellerBalance(double balance) {
        this.tellerBalance = balance;
    }
    public long getCreationTime() {
        return creationTime;
    }

    @Override
    public String toString() {

        String empString = "org.example.Teller:" + " ID-" + this.getID() + ", " + " Name-" + this.getUsername() + ", " + "Email-" + this.getEmail() + ", " + "Phone-" + this.getPhone();
        return empString;
    }

    @Override
    public int compareTo(Teller other) {
        if (this.tellerBalance > other.tellerBalance) {
            return -1;
        } else if (this.tellerBalance < other.tellerBalance) {
            return 1;
        }
        return Long.compare(other.creationTime, this.creationTime);
    }
    // org.example.Teller method stubs
    public void fetchTellerData() {
        System.out.println("Placeholder for org.example.Teller Data Stub");
    }
    public void fetchAssociatedCustomers() {
        System.out.println("Placeholder for associated customers");
    }
}
