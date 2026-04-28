package com.unit_converter.service.strategy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class TemperatureStrategyTest {

    private TemperatureStrategy temperatureStrategy = new TemperatureStrategy();

    @Test
    void shouldReturnTrueForValidUnit() {
        assertTrue(temperatureStrategy.checkUnit("c"));
    }

    @Test
    void shouldReturnFalseForInvalidUnit() {
        assertFalse(temperatureStrategy.checkUnit("n"));
    }

    @Test
    void shouldConvertFahrenheitToCelsius() {
        Double result = temperatureStrategy.convert(32, "f", "c");
        assertEquals(0, result);
    }
}
