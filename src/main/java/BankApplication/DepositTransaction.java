package BankApplication;

public abstract class DepositTransaction implements TransactionInterface {
    private Account bankAccount;
    private double amount;

    public DepositTransaction(double amount, Account bankAccount) {
        this.amount = amount;
        this.bankAccount = bankAccount;
    }
    @Override
    public void execute() {
        bankAccount.deposit(amount);
        System.out.println("Deposit of " + amount + "executed successfully.");
    }
}
