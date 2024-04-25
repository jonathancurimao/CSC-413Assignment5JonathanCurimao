package BankAppTest;

import BankApplication.User;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavatoJSONUser {
    public static void main (String[] args) { // run to test the User object
        ObjectMapper userMapper = new ObjectMapper();
        User user = new User();
        user.setName("John Doe");
        user.setEmail("jdoe@sfsu.edu");
        try {
            String jsonString = userMapper.writeValueAsString(user);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}