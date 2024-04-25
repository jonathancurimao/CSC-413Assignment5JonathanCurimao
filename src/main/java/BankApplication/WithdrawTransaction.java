package BankApplication;

public abstract class WithdrawTransaction implements TransactionInterface { // the purpose of this class is for the account withdrawing funds
    private Account account;
    private double amount;

    public WithdrawTransaction(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }
}

