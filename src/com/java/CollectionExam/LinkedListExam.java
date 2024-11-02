package com.java.CollectionExam;

import java.util.LinkedList;

public class LinkedListExam {
    public static void main(String[] args) {
        // ArrayList 사용
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("진표1");
        linkedList.add("진표2");
        linkedList.add("진표3");
        linkedList.add("진표4");

        for(String name : linkedList){
            System.out.println(name);
        }
        linkedList.remove(2);
        System.out.println("삭제 후");
        for(String name : linkedList){
            System.out.println(name);
        }
    }
}
