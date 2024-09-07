package com.example.capg.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DemoAppTest {

    @Test
    public void testAddNumbers() {
        DemoApp app = new DemoApp();
        assertEquals(8, app.addNumbers(5, 3), "5 + 3 should equal 8");
    }
}
