package com.java.ex08;

public class WrapperExam {
    public static void main(String[] args) {
        Integer integer = new Integer(123);
        int i = integer.intValue();
        System.out.println(i);

        String str = "456";
        int parsi = Integer.parseInt(str);
        System.out.println(parsi+111);
    }
}
