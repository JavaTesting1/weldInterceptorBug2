package de.stga.cditest.service;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.hamcrest.CoreMatchers;
import org.jboss.weld.environment.se.Weld;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import de.stga.cditest.model.SuperParam;

public abstract class AbstractServiceTest<S extends SuperParam> {

    private static Weld weld;

    @AfterClass
    public static void destroy() {
        weld.shutdown();
    }

    @BeforeClass
    public static void init() {
        weld = new Weld();
        weld.initialize();
    }

    public abstract AbstractService<S> getCurrentService();

    public abstract S getEntity();

    @Test
    public void testInterception() {

        try {
            this.getCurrentService().doSomething(this.getEntity());
            fail("RuntimeException is expected");
        } catch (RuntimeException e) {
            assertThat(e.getMessage(), CoreMatchers.is("Expected Exception"));
        }

    }

}
