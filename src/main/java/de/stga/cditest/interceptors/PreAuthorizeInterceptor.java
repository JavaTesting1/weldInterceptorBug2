package de.stga.cditest.interceptors;

import java.io.Serializable;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import de.stga.cditest.annotations.PreAuthorize;

@PreAuthorize
@Interceptor
public class PreAuthorizeInterceptor implements Serializable {

    private static final long serialVersionUID = 1L;

    @AroundInvoke
    public Object intercept(final InvocationContext invocationContext) throws Exception {
        throw new RuntimeException("Expected Exception");
    }

}
