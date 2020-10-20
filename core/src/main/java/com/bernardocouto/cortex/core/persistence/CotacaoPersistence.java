package com.bernardocouto.cortex.core.persistence;

import com.bernardocouto.cortex.domain.common.Cotacao;

public interface CotacaoPersistence extends DomainPersistence<Cotacao> {

    Cotacao save(final Cotacao cotacao);

}
