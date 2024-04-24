package BankApplication;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomerJunitTest {
    @Test
    void testCustomerConstructor() {
        Customer customer = new Customer();
        assertNotNull(customer, "Customer object should not be null");
    }

    @Test
    void testCustomersGettersandSetters() {
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Doe");
        assertEquals("John", customer.getFirstName(), "John is the First Name");
        assertEquals("Doe", customer.getLastName(), "Doe is the Last Name");
    }
}

