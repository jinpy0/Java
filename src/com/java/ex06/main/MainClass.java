package com.java.ex06.main;

import com.java.ex06.motors.Korea;
import com.java.ex06.motors.Motors;
import com.java.ex06.motors.Usa;

public class MainClass {
    public static void main(String[] args) {
        Motors m1 = new Korea();
        Motors m2 = new Usa();

        System.out.println("-----한국-----");
        m1.k3();
        m1.k5();
        m1.k7();

        System.out.println("-----미국-----");
        m2.k3();
        m2.k5();
        m2.k7();
    }
}
