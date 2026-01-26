package com.regexandjunit.junit.timeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() {
        TaskService service = new TaskService();
        service.longRunningTask(); // This test will FAIL (takes 3 sec)
    }
}
