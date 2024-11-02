package com.java.ex08;

public class StringBuilderExam {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I AM KING OF THE WORLD!");
        System.out.println(sb);

        sb.append(" really");
        System.out.println(sb);

        sb.insert(2, ", Jinpyo Lee");
        System.out.println(sb);

        sb.delete(9, 14);
        System.out.println(sb);

        sb.deleteCharAt(14);
        System.out.println(sb);
    }
}
