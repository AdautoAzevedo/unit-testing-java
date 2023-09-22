package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    Calculator calculator = new Calculator();
    @Test
    @DisplayName("Validate a sum function")
    public void shouldReturnFour() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    @DisplayName("Validate a subtraction function")
    public void shouldReturnFive() {
        assertEquals(5, calculator.subtraction(7, 2));
    }
}

