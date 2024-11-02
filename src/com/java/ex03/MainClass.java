package com.java.ex03;

public class MainClass {
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println(child.str);
        System.out.println(child.getPapaName());
        System.out.println(child.getMamaName());
    }
}
