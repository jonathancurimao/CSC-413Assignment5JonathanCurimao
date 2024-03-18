package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AdministratorJunitTest {

    @Test
    void testAdministratorConstructor() {
        Administrator admin = new Administrator();
        assertNotNull(admin, "Administrator object should not be null");
    }
    @Test
    void testAdministratorGettersandSetters() {
        Administrator admin = new Administrator();
        admin.setName("Admin Name");
        admin.setEmail("admin@example.com");
        assertEquals("Admin Name", admin.getName(), "Name should be the specific admin name");
        assertEquals("admin@example.com", admin.getEmail(), "Email should be the specific admin email");
    }
}
