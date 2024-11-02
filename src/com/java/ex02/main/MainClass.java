package com.java.ex02.main;

import com.java.ex02.child.Child1;
import com.java.ex02.child.Child2;
import com.java.ex02.papa.Papa;

public class MainClass {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();

        ch1.pping(5000);
        System.out.println(Papa.MONEY);
        ch2.pping(5000);
        System.out.println(Papa.MONEY);
    }
}
