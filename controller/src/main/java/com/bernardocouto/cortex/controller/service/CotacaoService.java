package com.bernardocouto.cortex.controller.service;

import com.bernardocouto.cortex.controller.mapper.CotacaoMapper;
import com.bernardocouto.cortex.controller.response.CotacaoResponse;
import com.bernardocouto.cortex.core.persistence.CotacaoPersistence;
import com.bernardocouto.cortex.domain.common.Cotacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class CotacaoService {

    private CotacaoPersistence cotacaoPersistence;

    @Autowired
    public CotacaoService(CotacaoPersistence cotacaoPersistence) {
        this.cotacaoPersistence = cotacaoPersistence;
    }

    public CotacaoResponse save(Cotacao cotacao) {
        cotacao.setId(UUID.randomUUID().toString());
        cotacao.setDataCriacao(LocalDateTime.now());
        return CotacaoMapper.INSTANCE.domainToResponse(cotacaoPersistence.save(cotacao));
    }

}
