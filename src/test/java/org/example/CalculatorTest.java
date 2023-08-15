package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
public class CalculatorTest {

    @DisplayName("덧셈 연산을 수행")
    @Test
    void addtionTest() {
        int calculate = Calculator.calculate(1, "+", 2);
        assertThat(reusult).isEqualTo(3);
    }
}
