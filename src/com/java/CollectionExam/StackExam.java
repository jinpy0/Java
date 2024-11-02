package com.java.CollectionExam;

import java.util.Stack;

public class StackExam {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Hello");
        stack.push("jinpyo");
        stack.push("jinpyo2");

        int n1 = stack.search("jinpyo"); // 위에서 부터 몇 번째에 있는지를 반환 ( 현재 : 2 )

        if (n1 != -1){
            System.out.println(n1);
        }
        else{
            System.out.println("No such element");
        }

        while(!stack.isEmpty()){ // 스택이 비어있지 않을 때 까지 반복
            Object obj = stack.pop(); // String 타입으로 반환이 됨.
            System.out.println(obj);
        }
    }
}
