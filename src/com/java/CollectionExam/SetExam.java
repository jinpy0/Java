package com.java.CollectionExam;

import java.util.HashSet;

public class SetExam {
    public static void main(String[] args) {
//        LinkedList<String> hset = new LinkedList<String>(); // 중복된 데이터 적용 O
//        ArrayList<String> hset  = new ArrayList<Strsing>(); // 중복된 데이터 적용 O
        HashSet<String> hset = new HashSet<String>(); // 중복된 데이터 적용 X

        hset.add("문자열0");
        hset.add("문자열1");
        hset.add("문자열2");
        hset.add("문자열3");
        hset.add("문자열2");
        System.out.println(hset.toString());

        hset.remove("문자열0");
        System.out.println(hset.toString());

        int i = hset.size();
        System.out.println("사이즈 : " + i);
    }
}
