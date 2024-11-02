package com.java.inter.main;

import com.java.inter.ex01.Inter1;
import com.java.inter.ex01.Inter2;
import com.java.inter.ex01.InterImple;

public class Main {
    public static void main(String[] args) {
        InterImple imp = new InterImple();
        System.out.println(imp.getStr());
        System.out.println(imp.sum(4, 7));
        System.out.println("----------");

        Inter1 in1 = new InterImple();
//         추상메서드 구현이 안돼있어서 객체화 할 수 없으므로
//         Inter1 에 있는 메서드만 사용 가능
        System.out.println(in1.sum(9, 6));
//        System.out.println(in1.getStr());

        Inter2 in2 = new InterImple();
        System.out.println(in2.getStr());
//        System.out.println(in2.sum(10,5));
//        Inter2에 있는 메서드만 사용 가능
    }
}
