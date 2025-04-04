package org.nickj.BFFDemo.Bean.Proxys;

import java.lang.reflect.Proxy;

public class SimpleDynamicProxy {

    static void consumer(Interface iface){
        iface.doSomething();
        iface.doSomethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);

        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(real));
        consumer(proxy);
    }

}
