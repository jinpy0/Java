package com.java.singleton;

public class SecondClass {
    public SecondClass() {
        SingletonClass sgtClass = SingletonClass.getSingletonClass();
        System.out.println("Second Class");
        System.out.println("i = " + sgtClass.getI());
    }
}
