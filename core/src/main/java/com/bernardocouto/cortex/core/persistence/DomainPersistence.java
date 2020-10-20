package com.bernardocouto.cortex.core.persistence;

import com.bernardocouto.cortex.domain.common.DomainObject;

public interface DomainPersistence<T extends DomainObject> {

    T save(T type);

}
