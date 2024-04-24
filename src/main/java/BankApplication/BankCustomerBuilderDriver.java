package BankApplication;

public class BankCustomerBuilderDriver {
    public static void main (String [] args) {

        Customer.BankCustomerBuilder builder = new Customer.BankCustomerBuilder(); // Instantiating BankCustomerBuilder

        Customer bankCustomer = builder.setName("John Doe")
                .setEmail("John.doe@example.com")
                .setAccountNumber(123456789)
                .build();

        // Printing the customer details to verify the object was created correctly
        System.out.println("Customer Name: " + bankCustomer.getFirstName());
        System.out.println("Customer Name: " + bankCustomer.getLastName());
        System.out.println("Customer Email: " + bankCustomer.getEmail());
        System.out.println("Customer Account Number: " + bankCustomer.getId());
    }
}
