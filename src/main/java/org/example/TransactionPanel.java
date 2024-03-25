package org.example;

import javax.swing.*;

public class TransactionPanel extends JPanel {
    JLabel transactionIdLabel = new JLabel("Transaction ID:");
    JTextField transactionIdField = new JTextField(10);
    JLabel amountLabel = new JLabel("Amount:");
    JTextField amountField = new JTextField(10);
    JLabel typeLabel = new JLabel("Type:");
    JTextField typeField = new JTextField(10);
    JButton updateAmountButton = new JButton("Confirm Transaction");

    public TransactionPanel() {
        add(transactionIdLabel);
        add(transactionIdField);
        add(amountLabel);
        add(amountField);
        add(typeLabel);
        add(typeField);
        add(updateAmountButton);
    }
}
