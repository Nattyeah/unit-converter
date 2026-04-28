package com.unit_converter.service;

import com.unit_converter.model.UnitConverterDto;
import com.unit_converter.service.strategy.LengthStrategy;
import com.unit_converter.service.strategy.TemperatureStrategy;
import com.unit_converter.service.strategy.WeightStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.unit_converter.mock.UnitConverterDtoMock.buildLengthDto;
import static com.unit_converter.mock.UnitConverterDtoMock.buildTemperatureDto;
import static com.unit_converter.mock.UnitConverterDtoMock.buildWeightDto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UnitConverterServiceTest {

    @Mock
    private LengthStrategy lengthStrategy;
    @Mock
    private WeightStrategy weightStrategy;
    @Mock
    private TemperatureStrategy temperatureStrategy;

    private UnitConverterService unitConverterService;

    @BeforeEach
    void setUp() {
        unitConverterService = new UnitConverterService(lengthStrategy, weightStrategy, temperatureStrategy);
    }

    @Test
    void testConvertLength() {
        UnitConverterDto dto = buildLengthDto();
        when(lengthStrategy.convert(100.0, "meter", "kilometer")).thenReturn(0.1);

        Double result = unitConverterService.convertLength(dto);
        assertEquals(0.1, result);
        verify(lengthStrategy).convert(100.0, "meter", "kilometer");
    }

    @Test
    void testConvertWeight() {
        UnitConverterDto dto = buildWeightDto();
        when(weightStrategy.convert(100.0, "grams", "kilograms")).thenReturn(0.1);

        Double result = unitConverterService.convertWeight(dto);
        assertEquals(0.1, result);
        verify(weightStrategy).convert(100.0, "grams", "kilograms");
    }

    @Test
    void testConvertTemperature() {
        UnitConverterDto dto = buildTemperatureDto();
        when(temperatureStrategy.convert(100.0, "celsius", "fahrenheit")).thenReturn(212.0);

        Double result = unitConverterService.convertTemperature(dto);
        assertEquals(212.0, result);
        verify(temperatureStrategy).convert(100.0, "celsius", "fahrenheit");
    }
}
