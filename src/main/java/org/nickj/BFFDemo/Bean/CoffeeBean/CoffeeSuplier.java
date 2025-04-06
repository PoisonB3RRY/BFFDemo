package org.nickj.BFFDemo.Bean.CoffeeBean;

import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class CoffeeSuplier implements Supplier<Coffee>, Iterable<Coffee> {

    private Class<?>[] coffeeTypes = {Americano.class, Breve.class, Capuccino.class, Latte.class, Mocha.class};
    private static Random rand = new Random(47);

    public CoffeeSuplier(){};
    private int size = 0;

    public CoffeeSuplier(int sz) {this.size = sz;}

    @Override
    public Coffee get() {
        try {
            return (Coffee) coffeeTypes[rand.nextInt(coffeeTypes.length)].newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee>{
        int count = size;
        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count --;
            return CoffeeSuplier.this.get();
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }

        @Override
        public void forEachRemaining(Consumer<? super Coffee> action) {
            Iterator.super.forEachRemaining(action);
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    @Override
    public void forEach(Consumer<? super Coffee> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Coffee> spliterator() {
        return Iterable.super.spliterator();
    }

    public static void main(String[] args) {
        Stream.generate(new CoffeeSuplier()).limit(10).forEach(System.out::println);

        for (Coffee c : new CoffeeSuplier(10)){
            System.out.println(c);
        }
    }
}
