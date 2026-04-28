package com.unit_converter.service;

import com.unit_converter.model.UnitConverterDto;
import com.unit_converter.service.strategy.LengthStrategy;
import com.unit_converter.service.strategy.TemperatureStrategy;
import com.unit_converter.service.strategy.WeightStrategy;
import org.springframework.stereotype.Service;

@Service
public class UnitConverterService {

    private final LengthStrategy lengthStrategy;
    private final WeightStrategy weightStrategy;
    private final TemperatureStrategy temperatureStrategy;

    public UnitConverterService(LengthStrategy lengthStrategy, WeightStrategy weightStrategy, TemperatureStrategy temperatureStrategy) {
        this.lengthStrategy = lengthStrategy;
        this.weightStrategy = weightStrategy;
        this.temperatureStrategy = temperatureStrategy;
    }

    public Double convertLength(UnitConverterDto unitConverterDto) {
        return lengthStrategy.convert(unitConverterDto.getValue(), unitConverterDto.getFrom(), unitConverterDto.getTo());
    }

    public Double convertWeight(UnitConverterDto unitConverterDto) {
        return weightStrategy.convert(unitConverterDto.getValue(), unitConverterDto.getFrom(), unitConverterDto.getTo());
    }

    public Double convertTemperature(UnitConverterDto unitConverterDto) {
        return temperatureStrategy.convert(unitConverterDto.getValue(), unitConverterDto.getFrom(), unitConverterDto.getTo());
    }

    public boolean checkUnit(String type, String unit) {
        return switch (type) {
            case "length" -> lengthStrategy.checkUnit(unit);
            case "weight" -> weightStrategy.checkUnit(unit);
            case "temperature" -> temperatureStrategy.checkUnit(unit);
            default -> throw new IllegalArgumentException("Invalid type: " + type);
        };
    }
}
