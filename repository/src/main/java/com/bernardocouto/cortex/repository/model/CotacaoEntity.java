package com.bernardocouto.cortex.repository.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@DynamoDBTable(tableName = "cortex")
@Getter
@Setter
public class CotacaoEntity {

    @DynamoDBHashKey(attributeName = "id")
    private String id;

    @DynamoDBAttribute(attributeName = "data_cotacao")
    private LocalDate dataCotacao;

    @DynamoDBAttribute(attributeName = "moeda_origem")
    private String moedaOrigem;

    @DynamoDBAttribute(attributeName = "moeda_final")
    private String moedaFinal;

    @DynamoDBAttribute(attributeName = "valor_desejado")
    private BigDecimal valorDesejado;

    @DynamoDBAttribute(attributeName = "data_criacao")
    private LocalDateTime dataCriacao;

}
