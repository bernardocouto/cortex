package com.bernardocouto.cortex.controller.mapper;

import com.bernardocouto.cortex.domain.common.Cotacao;
import com.bernardocouto.cortex.controller.response.CotacaoResponse;
import com.bernardocouto.cortex.controller.request.CotacaoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class CotacaoMapper {

    public static final CotacaoMapper INSTANCE = Mappers.getMapper(CotacaoMapper.class);

    public abstract CotacaoResponse domainToResponse(final Cotacao cotacao);

    public abstract Cotacao requestToDomain(final CotacaoRequest cotacaoRequest);

}
