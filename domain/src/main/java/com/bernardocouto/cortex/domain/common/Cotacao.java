package com.bernardocouto.cortex.domain.common;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Cotacao implements DomainObject {

    private UUID id;

    private LocalDate dataCotacao;

    private String moedaOrigem;

    private String moedaFinal;

    private BigDecimal valorDesejado;

    private LocalDateTime dataCriacao;

}
