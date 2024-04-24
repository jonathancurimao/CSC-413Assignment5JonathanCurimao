package BankApplication;

import javax.swing.*;

public class CustomerPanel extends JPanel {
    JLabel customerNameLabel = new JLabel("Customer Name:");
    JTextField customerNameField = new JTextField(10);
    JLabel emailLabel = new JLabel("Email:");
    JTextField emailField = new JTextField(10);
    JButton updateNameButton = new JButton("Confirm User");

    public CustomerPanel() {
        add(customerNameLabel);
        add(customerNameField);
        add(emailLabel);
        add(emailField);
        add(updateNameButton);
    }
}
