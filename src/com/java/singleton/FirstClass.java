package com.java.singleton;

public class FirstClass {
    public FirstClass() {
        SingletonClass sgtClass = SingletonClass.getSingletonClass();
        System.out.println("First Class");
        System.out.println("i = " + sgtClass.getI());
        sgtClass.setI(200);
        System.out.println("i = " + sgtClass.getI());
    }
}