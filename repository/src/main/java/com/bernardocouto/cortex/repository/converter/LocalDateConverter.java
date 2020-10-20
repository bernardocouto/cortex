package com.bernardocouto.cortex.repository.converter;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

import java.time.LocalDate;
import java.util.Objects;

public class LocalDateConverter implements DynamoDBTypeConverter<String, LocalDate> {

    @Override
    public String convert(final LocalDate object) {
        return Objects.nonNull(object) ? object.toString() : null;
    }

    @Override
    public LocalDate unconvert(final String object) {
        return Objects.nonNull(object) ? LocalDate.parse(object) : null;
    }

}
