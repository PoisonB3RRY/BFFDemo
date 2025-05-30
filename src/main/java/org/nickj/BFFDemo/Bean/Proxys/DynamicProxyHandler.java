package org.nickj.BFFDemo.Bean.Proxys;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    DynamicProxyHandler(Object proxied){
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*** proxy:" + proxied.getClass().getSimpleName() + ", method:" + method + ", args:" + args);
        if (args != null){
            for (Object arg: args){
                System.out.println("  " + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}
