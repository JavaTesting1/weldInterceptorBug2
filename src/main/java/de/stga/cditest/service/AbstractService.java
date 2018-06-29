package de.stga.cditest.service;

import de.stga.cditest.model.SuperParam;

public abstract class AbstractService<S extends SuperParam> {

    public S doSomething(final S param) {
        System.out.println("doSomething() AbstractService");
        return param;
    }
}
