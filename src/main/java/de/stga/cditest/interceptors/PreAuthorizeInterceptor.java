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
        System.out.println("INTERCEPT START");
        Object object = invocationContext.proceed();
        System.out.println("INTERCEPT END");
        return object;
    }

}
