package com.java.Ex09;

import java.util.HashSet;

public class MainClass {
    public static void main(String[] args) {
        HashSet<Student> hSet = new HashSet<Student>();
        hSet.add(new Student("일진표", 1));
        hSet.add(new Student("이진표", 2));
        hSet.add(new Student("삼진표", 3));

        System.out.println(hSet.toString());

        Student st = new Student("삼진표", 3);
//        System.out.println(hSet.toString());
        hSet.remove(st);

        System.out.println(hSet.toString());
    }
}
