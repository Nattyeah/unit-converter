package com.unit_converter.mock;

import com.unit_converter.model.UnitConverterDto;

public class UnitConverterDtoMock {
    public static UnitConverterDto buildLengthDto() {
        return new UnitConverterDto("meter", "kilometer", 100.0);
    }

    public static UnitConverterDto buildWeightDto() {
        return new UnitConverterDto("grams", "kilograms", 100.0);
    }

    public static UnitConverterDto buildTemperatureDto() {
        return new UnitConverterDto("celsius", "fahrenheit", 100.0);
    }
}
