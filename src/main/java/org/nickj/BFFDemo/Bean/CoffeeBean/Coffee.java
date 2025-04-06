package org.nickj.BFFDemo.Bean.CoffeeBean;

public class Coffee {

    public static int count = 0;
    public final int id = count++;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ":" + id;
    }
}
