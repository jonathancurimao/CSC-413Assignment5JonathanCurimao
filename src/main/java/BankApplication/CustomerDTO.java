package BankApplication;

import java.sql.SQLException;

public class CustomerDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    static CustomerDAOConcrete cd = new CustomerDAOConcrete();

    public CustomerDTO() {

    }

    public CustomerDTO(int custID, String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        id = custID;
    }

    public CustomerDTO(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    // Getter and Setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getID() {
        return id;
    }

    public void setID(int anID) {
        this.id = anID;
    }

    public static Customer customerByID(int anID) {
        Customer aCustomer = null;

        try {
            aCustomer = cd.get(anID);
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
        if (aCustomer != null)
            System.out.println(aCustomer.toString());

        System.out.println("\nFetched Customer with ID: " + anID + " Customer Details:\n" + aCustomer.toString());
        return aCustomer;
    }

    public static int performUpdate(Customer aCustomer) {
        int updateResult = -1;

        try {
            updateResult = cd.update(aCustomer);
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }

        if (updateResult != -1)  System.out.println("\nUpdate Successful");
        System.out.println("Customer Details: \n" + aCustomer.toString());
        return updateResult;
    }
}
