package org.example;
import javax.swing.*;
import java.awt.*;

public class BankingFrame extends JFrame { // this class sets up the main window of the application which is a work in progress

    public BankingFrame() {

    }

    public void createBankGUI() { // for now, this will be basis for the Bank Application GUI, this would be ran through the BankingApplication class
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(new AccountPanel(), BorderLayout.NORTH);
        this.add(new CustomerPanel(), BorderLayout.CENTER);
        this.add(new TransactionPanel(), BorderLayout.SOUTH);

        this.setVisible(true);
    }
}

