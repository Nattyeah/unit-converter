package com.unit_converter.service.strategy;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TemperatureStrategy implements UnitConverterStrategy {

    private final List<String> TEMPERATURE = List.of("C", "F", "K");

    @Override
    public Double convert(double value, String from, String to) {
        from = from.toUpperCase();
        to = to.toUpperCase();

        Double celsius = null;
        if (from.equals("C")) {
            celsius = value;
        } else if (from.equals("F")) {
            celsius = (value - 32) * 5/9;
        } else if (from.equals("K")) {
            celsius = value - 273.15;
        }

        if (to.equals("C")) {
            return celsius;
        } else if (to.equals("F")) {
            return celsius * 9/5 + 32;
        } else if (to.equals("K")) {
            return celsius + 273.15;
        }

        return null;
    }

    @Override
    public boolean checkUnit(String unit) {
        return TEMPERATURE.contains(unit.toUpperCase());
    }
}
