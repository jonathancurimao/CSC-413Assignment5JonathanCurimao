package BankApplication;

import javax.swing.*;
public class AccountPanel extends JPanel {
    JLabel accountIdLabel = new JLabel("Account Id:");
    JTextField accountIdField = new JTextField(10);
    JLabel balanceLabel = new JLabel("Balance:");
    JTextField balanceField = new JTextField(10);
    JButton updateBalanceButton = new JButton("Confirm Balance");

    public AccountPanel() {
        add(accountIdLabel);
        add(accountIdField);
        add(balanceLabel);
        add(balanceField);
        add(updateBalanceButton);
    }


}
