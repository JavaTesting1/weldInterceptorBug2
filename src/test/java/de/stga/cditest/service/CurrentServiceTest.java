package de.stga.cditest.service;

import javax.enterprise.inject.spi.CDI;

import de.stga.cditest.model.CurrentParam;

public class CurrentServiceTest extends AbstractServiceTest<CurrentParam> {

    @Override
    public AbstractService<CurrentParam> getCurrentService() {
        return CDI.current().select(CurrentService.class).get();
    }

    @Override
    public CurrentParam getEntity() {
        return new CurrentParam();
    }

}
