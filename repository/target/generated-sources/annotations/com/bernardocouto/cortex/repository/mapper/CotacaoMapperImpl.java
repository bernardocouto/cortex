package com.bernardocouto.cortex.repository.mapper;

import com.bernardocouto.cortex.domain.common.Cotacao;
import com.bernardocouto.cortex.repository.model.CotacaoEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-20T17:08:38-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15 (Oracle Corporation)"
)
public class CotacaoMapperImpl extends CotacaoMapper {

    @Override
    public CotacaoEntity entityToDomain(Cotacao cotacao) {
        if ( cotacao == null ) {
            return null;
        }

        CotacaoEntity cotacaoEntity = new CotacaoEntity();

        cotacaoEntity.setId( cotacao.getId() );
        cotacaoEntity.setDataCotacao( cotacao.getDataCotacao() );
        cotacaoEntity.setMoedaOrigem( cotacao.getMoedaOrigem() );
        cotacaoEntity.setMoedaFinal( cotacao.getMoedaFinal() );
        cotacaoEntity.setValorDesejado( cotacao.getValorDesejado() );
        cotacaoEntity.setDataCriacao( cotacao.getDataCriacao() );

        return cotacaoEntity;
    }
}
