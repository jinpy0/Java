package com.java.ex05;

public class Child extends Parent {
    public Child(){
        System.out.println("3");
        super.method();
        this.method();
    }
    @Override
    public void method() {
        super.method();
        System.out.println("4");
    }
}
