package BankApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TransactionJunitTest {

    Transaction transaction;
    double delta = 0.001;

    @BeforeEach
    void setUp() {
        transaction = new Transaction();
        transaction.setAmount(1000);
        transaction.setType("deposit");
    }

    @Test
    void checkTransactionDetailsTest() {
        assertEquals(1000, transaction.getAmount(), delta, "Check Transaction Amount Test");
        assertEquals("deposit", transaction.getType(), "Check Transaction Type Test");
    }
}

