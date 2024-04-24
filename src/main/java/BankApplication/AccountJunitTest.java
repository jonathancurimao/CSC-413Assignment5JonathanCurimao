package BankApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class AccountJunitTest {

    Account account;
    double delta = 0.001;

    @BeforeEach
    void setUp() {
        Customer customer = new Customer();
        account = new Account(customer);
        account.setBalance(5000);
    }

    @Test
    void depositTest() {
        account.deposit(500);
        assertEquals(5500, account.getBalance(), delta, "Deposit Test");
    }

    @Test
    void withdrawTest() {
        account.withdraw(500);
        assertEquals(4500, account.getBalance(), delta, "Withdraw Test");
    }

    @Test
    void checkBalanceTest() {
        assertEquals(5000, account.getBalance(), delta, "Check Balance Test");
    }
}

