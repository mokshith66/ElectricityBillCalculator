
package com.electricity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ElectricityBillTest {

    ElectricityBill bill = new ElectricityBill();

    // Test 1: First slab
    @Test
    void testFirstSlab() {
        assertEquals(125.0, bill.calculateBill(50), 0.001);
    }

    // Test 2: Exactly 100 units
    @Test
    void testFirstBoundary() {
        assertEquals(200.0, bill.calculateBill(100), 0.001);
    }

    // Test 3: Exactly 200 units
    @Test
    void testSecondBoundary() {
        assertEquals(450.0, bill.calculateBill(200), 0.001);
    }

    // Test 4: Consumption across multiple slabs
    @Test
    void testMultipleSlabs() {
        assertEquals(650.0, bill.calculateBill(250), 0.001);
    }

    // Test 5: Zero units
    @Test
    void testZeroUnits() {
        assertEquals(50.0, bill.calculateBill(0), 0.001);
    }

    // Test 6: Negative units
    @Test
    void testNegativeUnits() {
        assertThrows(
            IllegalArgumentException.class,
            () -> bill.calculateBill(-10)
        );
    }
}
