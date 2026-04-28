package com.unit_converter.service.strategy;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class WeightStrategy implements UnitConverterStrategy {

    private final Map<String, Double> WEIGHTS = Map.of(
            "mg", 0.001,
            "g", 1.0,
            "kg", 1000.0,
            "oz", 28.3495,
            "lb", 453.592
            );

    @Override
    public Double convert(double value, String from, String to) {
        double valueToConvert = value * WEIGHTS.get(from);
        return valueToConvert / WEIGHTS.get(to);
    }

    @Override
    public boolean checkUnit(String unit) {
        return WEIGHTS.containsKey(unit);
    }
}
