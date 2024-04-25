package BankAppTest;

import BankApplication.*;


public class BankAccountTransactionTest { // this will test the Transaction interface and the execute commands
    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "Jonathan","Curimao","jcurimao1@sfsu.edu", "123-456-789",new Address(689273,"123 Main St.", "San Francisco", "San Mateo","94014","The United States"),0); // using the customer class to create a new account

        Account checkingAccount = new Account(customer1);
        Account savingsAccount = new Account(customer1);

        // Deposits 100 into the checking account
        TransactionInterface depositChecking = new AccountDeposit(checkingAccount, 100);
        depositChecking.execute();

        // Withdraws 50 from the checking account
        TransactionInterface withdrawChecking = new AccountWithdrawal(checkingAccount, 50);
        withdrawChecking.execute();

        // Deposits 200 into the savings account
        TransactionInterface depositSavings = new AccountDeposit(savingsAccount, 200);
        depositSavings.execute();

        // Attempts to withdraw 300 from the savings account (should fail due to insufficient balance)
        TransactionInterface withdrawSavings = new AccountWithdrawal(savingsAccount, 300);
        withdrawSavings.execute();
    }
}

