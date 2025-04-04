package org.nickj.BFFDemo.Bean;

import org.junit.jupiter.api.Test;

public class ClassTest {

    static{System.out.println("ClassTest loaded");}

    ClassTest(){

    }

    @Test
    public void runtest() throws ClassNotFoundException {
//        System.out.println(ClassTest.class.getName());
//        System.out.println(ClassTest.class.getSimpleName());
//        System.out.println(ClassTest.class.getCanonicalName());
        Class cc = Class.forName("org.nickj.BFFDemo.Bean.ClassTest");
        System.out.println("for Name Done");
        try {
//            Class<ClassTest> clazz = ClassTest.class;
            ClassTest test =(ClassTest) cc.newInstance();
            System.out.println(test);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
