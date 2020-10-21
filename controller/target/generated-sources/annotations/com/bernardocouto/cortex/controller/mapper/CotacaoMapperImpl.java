package com.bernardocouto.cortex.controller.mapper;

import com.bernardocouto.cortex.controller.request.CotacaoRequest;
import com.bernardocouto.cortex.controller.response.CotacaoResponse;
import com.bernardocouto.cortex.domain.common.Cotacao;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-20T17:08:36-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15 (Oracle Corporation)"
)
public class CotacaoMapperImpl extends CotacaoMapper {

    @Override
    public CotacaoResponse domainToResponse(Cotacao cotacao) {
        if ( cotacao == null ) {
            return null;
        }

        CotacaoResponse cotacaoResponse = new CotacaoResponse();

        cotacaoResponse.setId( cotacao.getId() );
        cotacaoResponse.setDataCotacao( cotacao.getDataCotacao() );
        cotacaoResponse.setMoedaOrigem( cotacao.getMoedaOrigem() );
        cotacaoResponse.setMoedaFinal( cotacao.getMoedaFinal() );
        cotacaoResponse.setValorDesejado( cotacao.getValorDesejado() );
        cotacaoResponse.setDataCriacao( cotacao.getDataCriacao() );

        return cotacaoResponse;
    }

    @Override
    public Cotacao requestToDomain(CotacaoRequest cotacaoRequest) {
        if ( cotacaoRequest == null ) {
            return null;
        }

        Cotacao cotacao = new Cotacao();

        cotacao.setDataCotacao( cotacaoRequest.getDataCotacao() );
        cotacao.setMoedaOrigem( cotacaoRequest.getMoedaOrigem() );
        cotacao.setMoedaFinal( cotacaoRequest.getMoedaFinal() );
        cotacao.setValorDesejado( cotacaoRequest.getValorDesejado() );

        return cotacao;
    }
}
