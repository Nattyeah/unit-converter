package com.unit_converter.service.strategy;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class LengthStrategy implements UnitConverterStrategy {
    private final Map<String, Double> LENGTH_UNIT = Map.of(
            "mm", 0.001,
            "cm", 0.01,
            "m", 1.0,
            "km", 1000.0,
            "in", 0.0254,
            "ft", 0.3048,
            "yd", 0.9144,
            "mi", 1609.344
    );

    @Override
    public Double convert(double value, String from, String to) {
        double valueToConvert = value * LENGTH_UNIT.get(from);
        return valueToConvert / LENGTH_UNIT.get(to);
    }

    @Override
    public boolean checkUnit(String unit) {
        return LENGTH_UNIT.containsKey(unit);
    }
}
