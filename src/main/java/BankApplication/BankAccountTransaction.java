package BankApplication;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class BankAccountTransaction { // the invoker for the command pattern
    private int id;
    private String datetime;
    private String type;
    private double amount;
    private String description;
    private Account sourceAccount;
    private Account destinationAccount;
    private String status;
    private Account account;
    private TransactionInterface transaction;

    public BankAccountTransaction(int id, String type, double amount, String description, Account account) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.account = account;
        this.datetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.status = "Pending";
    }

    public void setTransaction (TransactionInterface transaction) {
        this.transaction = transaction;
    }

    public void executeTransaction() {
        if (transaction != null) {
            transaction.execute();
            this.status = "Transaction success";
        } else {
            this.status = "Transaction failed";
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(Account destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
