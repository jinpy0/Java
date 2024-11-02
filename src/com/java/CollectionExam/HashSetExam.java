package com.java.CollectionExam;

import java.util.HashSet;

public class HashSetExam {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();

        hset.add("A");
        hset.add("B");
        hset.add("C");
        hset.add("D");
        hset.add("E");
        System.out.println(hset.toString());

        //hset.remove("A"); 아래 코드와 동일
        String st = "A";
        hset.remove(st);

        System.out.println(hset.toString());
        int i = hset.size();
        System.out.println(i);
        
    }
}
