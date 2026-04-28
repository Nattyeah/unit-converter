package com.unit_converter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class UnitConverterDto {
    private String from;
    private String to;
    private double value;
}
