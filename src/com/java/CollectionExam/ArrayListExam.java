package com.java.CollectionExam;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        // ArrayList 사용
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("진표1");
        arrayList.add("진표2");
        arrayList.add("진표3");
        arrayList.add("진표4");

//        String name = arrayList.get(0);
    for(String name : arrayList){
        System.out.println(name);
    }
    arrayList.remove(2);
    System.out.println("삭제 후");
    for(String name : arrayList){
        System.out.println(name);
    }

    }

}
