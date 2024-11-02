package com.java.ex04;

public class Child extends Parent {
    public Child() {
        super();
    }

    @Override
    public void method1() {
        System.out.println("자식 것1");
    }

    public void method3() {
        System.out.println("자식 것3");
    }
}
