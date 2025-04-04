package org.nickj.BFFDemo.Bean.Proxys;

public class RealObject implements Interface{
    @Override
    public void doSomething() {
        System.out.println("do something");
    }

    @Override
    public void doSomethingElse(String args) {
        System.out.println("do something else + " + args);
    }
}
