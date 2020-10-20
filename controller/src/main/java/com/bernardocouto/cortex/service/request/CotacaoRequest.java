package com.bernardocouto.cortex.service.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Setter
public class CotacaoRequest {

    @JsonProperty("data_cotacao")
    private LocalDate dataCotacao;

    @JsonProperty("moeda_origem")
    private String moedaOrigem;

    @JsonProperty("moeda_final")
    private String moedaFinal;

    @JsonProperty("valor_desejado")
    private BigDecimal valorDesejado;

}
