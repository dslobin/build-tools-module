package com.epam.btm.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @Test
    void isPositive_ShouldReturnTrueForPositiveNumbers() {
        final String positiveNumber = "3.14";
        assertTrue(StringUtils.isPositiveNumber(positiveNumber));
    }

    @Test
    void isPositive_ShouldReturnFalseForNegativeNumbers() {
        final String negativeNumber = "-1";
        assertFalse(StringUtils.isPositiveNumber(negativeNumber));
    }
}
