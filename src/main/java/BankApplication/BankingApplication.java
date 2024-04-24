package BankApplication;
import javax.swing.*;
public class BankingApplication { // launches the bank application when you run it
    public static void main(String [] args) {
        SwingUtilities.invokeLater(() -> { // lambda function to ensure the UI is created
            BankingFrame bankingFrame = new BankingFrame(); // creating an instance of the main application
            bankingFrame.createBankGUI();;
        });
    }
}
