package com.unit_converter.service.strategy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class WeightStrategyTest {

    private WeightStrategy weightStrategy = new WeightStrategy();

    @Test
    void shouldReturnTrueForValidUnit() {
        assertTrue(weightStrategy.checkUnit("g"));
    }

    @Test
    void shouldReturnFalseForInvalidUnit() {
        assertFalse(weightStrategy.checkUnit("n"));
    }

    @Test
    void shouldConvertGramToKilogram() {
        Double result = weightStrategy.convert(100.0, "g", "kg");
        assertEquals(0.1, result);
    }
}
