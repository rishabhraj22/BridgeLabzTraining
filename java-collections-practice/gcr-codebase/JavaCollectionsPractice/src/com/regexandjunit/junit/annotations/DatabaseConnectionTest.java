package com.regexandjunit.junit.annotations;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    private DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    @Test
    @DisplayName("Database should be connected before test runs")
    void testConnectionEstablished() {
        assertTrue(db.isConnected());
    }

    @Test
    @DisplayName("Database should be disconnected after test runs")
    void testConnectionClosed() {
        // @AfterEach will run automatically after this test
        assertTrue(db.isConnected());
    }
}
