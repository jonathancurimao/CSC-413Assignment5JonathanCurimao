package BankApplication;

public class AccountDeposit implements TransactionInterface { // Transaction command for depositing balance
    private Account account;
    private double amount;
    public AccountDeposit (Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void undo() {
        account.withdraw(amount);
    }
}
