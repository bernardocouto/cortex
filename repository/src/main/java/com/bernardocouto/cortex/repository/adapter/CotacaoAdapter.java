package com.bernardocouto.cortex.repository.adapter;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.bernardocouto.cortex.domain.common.Cotacao;
import com.bernardocouto.cortex.core.persistence.CotacaoPersistence;
import com.bernardocouto.cortex.repository.model.CotacaoEntity;
import com.bernardocouto.cortex.repository.mapper.CotacaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CotacaoAdapter implements CotacaoPersistence {

    private DynamoDBMapper dynamoDBMapper;

    @Autowired
    public CotacaoAdapter(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    @Override
    public Cotacao save(final Cotacao cotacao) {
        final CotacaoEntity cotacaoEntity = CotacaoMapper.INSTANCE.entityToDomain(cotacao);
        dynamoDBMapper.save(cotacaoEntity);
        return cotacao;
    }

}
