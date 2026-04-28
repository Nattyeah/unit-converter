package com.unit_converter.service.strategy;

public interface UnitConverterStrategy {
    Double convert(double value, String from, String to);

    boolean checkUnit(String unit);
}
