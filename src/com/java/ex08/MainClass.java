package com.java.ex08;

public class MainClass {
    public static void main(String[] args) {
        String st1 = "i am jinpyo lee.";
        String st2 = "I AM A KING OF THE WORLD!";

        // 따로 저장하지 않았으면 다음에 st1을 호출할 땐 처음 st1을 생성했을 때 지정해 둔 데이터
        // println 으로 값을 보는 것 말고 변수에 저장을 하면 다음에 호출할 때 함수의 내용을 실행한 값이 나옴

        System.out.println(st1.concat(st2));
        // 문자열 배열을 이어붙임

        System.out.println(st1.substring(3));
        // 문자열 배열의 3번째 인덱스 앞을 잘라라

        System.out.println(st1.length());
        // 문자열 배열의 길이

        System.out.println(st1.toUpperCase());
        // 문자열을 대문자로 바꾸기

        System.out.println(st2.toLowerCase());
        // 문자열을 소문자로 바꾸기

        System.out.println(st1.charAt(3));


        System.out.println(st1.indexOf('e'));

        String st3 = "i am suji bae";

        System.out.println(st1.equals(st3));
        System.out.println(st1.trim());
        System.out.println(st1.replace(".","!"));
        System.out.println(st1.replaceAll("i am", "you are"));
        System.out.println(st1);
    }
}
