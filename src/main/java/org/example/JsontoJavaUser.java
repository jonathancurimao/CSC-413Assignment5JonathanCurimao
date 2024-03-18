package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsontoJavaUser {
    public static void main (String [] args) { // also run to test user object
        ObjectMapper userMapper = new ObjectMapper();
        String jsonString = "{\"name\":\"John Doe\",\"email\":\"jdoe@sfsu.edu\"}";
        try {
            User user = userMapper.readValue(jsonString, User.class);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
