package BankApplication;

public class AccountWithdrawal implements TransactionInterface {
    private Account account;
    private double amount;

    public AccountWithdrawal(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }

    @Override
    public void undo() {
        account.deposit(amount);
    }
}

