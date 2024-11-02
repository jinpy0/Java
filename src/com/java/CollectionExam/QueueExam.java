package com.java.CollectionExam;

import java.util.LinkedList;

public class QueueExam {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");

        int n2 = queue.indexOf("d"); // 인덱스로 접근, 인덱스가 존재하지 않으면 -1을 반환

        if (n2 != -1) {
            System.out.println(n2);
        }
        else {
            System.out.println("XX");
        }

        while (!queue.isEmpty()) {
            Object o = queue.poll();
            System.out.println(o);
        }
    }
}
