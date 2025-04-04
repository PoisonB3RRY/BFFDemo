package org.nickj.BFFDemo.Bean.Filter;

import java.util.stream.Stream;

public class RegistryFactories {

    public static void main(String[] args) {
        Stream.generate(new Part()).limit(20).forEach(System.out::println);
    }
}
