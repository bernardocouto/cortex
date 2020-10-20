package com.bernardocouto.cortex.repository.mapper;

import com.bernardocouto.cortex.domain.common.Cotacao;
import com.bernardocouto.cortex.repository.model.CotacaoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class CotacaoMapper {

    public static final CotacaoMapper INSTANCE = Mappers.getMapper(CotacaoMapper.class);

    public abstract CotacaoEntity entityToDomain(final Cotacao cotacao);

}
