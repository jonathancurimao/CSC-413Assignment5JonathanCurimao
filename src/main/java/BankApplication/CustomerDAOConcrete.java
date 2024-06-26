package BankApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class CustomerDAOConcrete implements DAOInterface<Customer> {

    static Connection connection = null;
    PreparedStatement pStatement;
    ResultSet result;
    static String url = CustomerDataConnection.getURL();
    static String username = CustomerDataConnection.getUsername();
    static String pwd = CustomerDataConnection.getPassword();

    CustomerDAOConcrete() {
        try {
            connection = CustomerDataConnection.getDBConnection();
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }

    // Method to disconnect from the database
    public static void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    // Method to insert a customer into the database
    @Override
    public int insert(Customer customer) throws SQLException {
        int res = -1;
        pStatement = connection.prepareStatement(CustomerDataConnection.getInsert());
        pStatement.setString(1, customer.getFirstName());
        pStatement.setString(2, customer.getLastName());
        pStatement.setString(3, customer.getEmail());
        pStatement.setString(4, customer.getPhone());
        res = pStatement.executeUpdate();
        disconnect();
        return res;
    }

    // Method to retrieve a customer from the database by ID
    @Override
    public Customer get(int anID) throws SQLException {
        pStatement = connection.prepareStatement(CustomerDataConnection.getSelect());
        pStatement.setInt(1, anID);
        result = pStatement.executeQuery();

        Customer updatedCustomer = null;
        if (result.next()) {
            Customer c = new Customer();
            Address address = result.getObject("address", Address.class);
            updatedCustomer = new Customer(result.getInt("id"), result.getString("firstName"), result.getString("lastName"), result.getString("email"), result.getString("phone"), address, result.getDouble("balance"));
        }

        return updatedCustomer;
    }

    // Method to update a customer in the database
    @Override
    public int update(Customer customer) throws SQLException {
        int result = -1;

        pStatement = connection.prepareStatement(CustomerDataConnection.getUpdate());
        pStatement.setString(1, customer.getFirstName());
        pStatement.setString(2, customer.getLastName());
        pStatement.setString(3, customer.getEmail());
        pStatement.setString(4, customer.getPhone());
        pStatement.setInt(5, customer.getId());
        result = pStatement.executeUpdate();

        return result;
    }

    // Method to delete a customer from the database
    @Override
    public int delete(Customer customer) throws SQLException {
        int res = -1;

        pStatement = connection.prepareStatement(CustomerDataConnection.getDelete());
        pStatement.setInt(1, customer.getId());
        res = pStatement.executeUpdate();

        return res;
    }

    // Method to save a customer in the database
    @Override
    public int save(Customer customer) throws SQLException {
        int res = -1;

        pStatement = connection.prepareStatement(CustomerDataConnection.getInsert());
        pStatement.setString(1, customer.getFirstName());
        pStatement.setString(2, customer.getLastName());
        pStatement.setString(3, customer.getEmail());
        pStatement.setString(4, customer.getPhone());
        pStatement.setInt(5, customer.getId());
        res = pStatement.executeUpdate();

        return res;
    }
}

