package BankApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerController implements ActionListener {
    private CustomerPanel customerPanel;
    private Customer customer;
    public CustomerController (CustomerPanel customerPanel, Customer customer) {
        this.customerPanel = customerPanel;
        this.customer = customer;

        customerPanel.updateNameButton.addActionListener(this); // for the button in the CustomerPanel
    }

    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == customerPanel.updateNameButton) {
            String FirstName = customerPanel.customerNameField.getText();
            String LastName = customerPanel.customerNameField.getText();
            customer.setFirstName(FirstName);
            customer.setLastName(LastName);
            customerPanel.customerNameField.setText(customer.getFirstName());
            customerPanel.customerNameField.setText(customer.getLastName());
        }
    }
}
