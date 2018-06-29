package de.stga.cditest.service;

import de.stga.cditest.annotations.PreAuthorize;
import de.stga.cditest.model.CurrentParam;

public class CurrentService extends AbstractService<CurrentParam> {

    @Override
    @PreAuthorize
    public CurrentParam doSomething(final CurrentParam param) {
        System.out.println("doSomething() CurrentService");
        return super.doSomething(param);
    }

}
