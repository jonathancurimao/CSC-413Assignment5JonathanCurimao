package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountController implements ActionListener {
    private AccountPanel accountPanel;
    private Account account;

    public AccountController(AccountPanel accountPanel, Account account) {
        this.accountPanel = accountPanel;
        this.account = account;
        accountPanel.updateBalanceButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == accountPanel.updateBalanceButton) {
            // for now, this will update the account balance based on the user input
            double newBalance = Double.parseDouble(accountPanel.balanceField.getText()); // updates account balance based on user input
            account.setBalance(newBalance);

            accountPanel.balanceField.setText(String.valueOf(account.getBalance())); // updates the UI to reflect changes
        }
    }
}
