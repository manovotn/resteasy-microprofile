package org.jboss.resteasy.microprofile.test.client.integration.resource;

import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Intercepted;
import jakarta.enterprise.inject.spi.Bean;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MyInterceptorBinding
@Priority(1)
@Interceptor
public class MyInterceptor {

    @Inject
    @Intercepted
    Bean<?> bean;

    @AroundInvoke
    public Object doSomething(InvocationContext ic) throws Exception {
        return ic.proceed();
    }
}
