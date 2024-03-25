package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TransactionController implements ActionListener {
    private TransactionPanel transactionPanel;
    private Transaction transaction;

    public TransactionController(TransactionPanel transactionPanel, Transaction transaction) {
        this.transactionPanel = transactionPanel;
        this.transaction = transaction;

        transactionPanel.updateAmountButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == transactionPanel.updateAmountButton) { // when action event is called
            double newAmount = Double.parseDouble(transactionPanel.amountField.getText());
            transaction.setAmount(newAmount);
            transactionPanel.amountField.setText(String.valueOf(transaction.getAmount()));
        }
    }
}
