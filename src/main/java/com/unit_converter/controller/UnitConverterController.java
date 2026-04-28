package com.unit_converter.controller;

import com.unit_converter.model.UnitConverterDto;
import com.unit_converter.service.UnitConverterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/unit-converter")
public class UnitConverterController {

    private final UnitConverterService unitConverterService;

    public UnitConverterController(UnitConverterService unitConverterService) {
        this.unitConverterService = unitConverterService;
    }

    @PostMapping("/length")
    public ResponseEntity<?> convertLength(@RequestBody UnitConverterDto unitConverterDto) {
        if (!unitConverterService.checkUnit("length", unitConverterDto.getFrom()) || !unitConverterService.checkUnit("length", unitConverterDto.getTo())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid unit");
        }

        double length = unitConverterService.convertLength(unitConverterDto);
        return ResponseEntity.ok(length);
    }

    @PostMapping("/weight")
    public ResponseEntity<?> convertWeight(@RequestBody UnitConverterDto unitConverterDto) {
        if (!unitConverterService.checkUnit("weight", unitConverterDto.getFrom()) || !unitConverterService.checkUnit("weight", unitConverterDto.getTo())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid unit");
        }

        double weight = unitConverterService.convertWeight(unitConverterDto);
        return ResponseEntity.ok(weight);
    }

    @PostMapping("/temperature")
    public ResponseEntity<?> convertTemperature(@RequestBody UnitConverterDto unitConverterDto) {
        if (!unitConverterService.checkUnit("temperature", unitConverterDto.getFrom()) || !unitConverterService.checkUnit("temperature", unitConverterDto.getTo())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid unit");
        }

        double temperature = unitConverterService.convertTemperature(unitConverterDto);
        return ResponseEntity.ok(temperature);
    }
}
