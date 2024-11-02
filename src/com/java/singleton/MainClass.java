package com.java.singleton;

public class MainClass {
    public static void main(String[] args) {
        FirstClass fc = new FirstClass();
        SecondClass sc = new SecondClass();
        // FirstClass, SecondClass 로 만들어진 인스턴스는
        // 둘 다 모두 하나의 인스턴스로 취급
        // -> 둘 다 똑같은 주소값을 가짐 -> 값 동일함
    }
}
