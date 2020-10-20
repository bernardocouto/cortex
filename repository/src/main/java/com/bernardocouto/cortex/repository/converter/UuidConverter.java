package com.bernardocouto.cortex.repository.converter;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

import java.util.Objects;
import java.util.UUID;

public class UuidConverter implements DynamoDBTypeConverter<String, UUID> {

    @Override
    public String convert(final UUID object) {
        return Objects.nonNull(object) ? object.toString() : null;
    }

    @Override
    public UUID unconvert(final String object) {
        return Objects.nonNull(object) ? UUID.fromString(object) : null;
    }

}
