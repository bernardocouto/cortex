package com.bernardocouto.cortex.service.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class CotacaoResponse {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("data_cotacao")
    private LocalDate dataCotacao;

    @JsonProperty("moeda_origem")
    private String moedaOrigem;

    @JsonProperty("moeda_final")
    private String moedaFinal;

    @JsonProperty("valor_desejado")
    private BigDecimal valorDesejado;

    @JsonProperty("data_criacao")
    private LocalDateTime dataCriacao;

}
