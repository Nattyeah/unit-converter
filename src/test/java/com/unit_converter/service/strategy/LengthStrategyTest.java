package com.unit_converter.service.strategy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class LengthStrategyTest {

    private LengthStrategy lengthStrategy = new LengthStrategy();

    @Test
    void shouldReturnTrueForValidUnit() {
        assertTrue(lengthStrategy.checkUnit("m"));
    }

    @Test
    void shouldReturnFalseForInvalidUnit() {
        assertFalse(lengthStrategy.checkUnit("n"));
    }

    @Test
    void shouldConvertMetersToKilometers() {
        Double result = lengthStrategy.convert(1000, "m", "km");
        assertEquals(1.0, result);
    }
}
