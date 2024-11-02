package com.java.Ex09;

public class Student {
    private String name;
    private int num;

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return name + " : " + num;
    }

    @Override
    public boolean equals(Object obj) {
        String compareValue = obj.toString();
        String thisValue = toString();
        return compareValue.equals(thisValue); // boolean 형태로 반환
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
//        // toString()을 호출하여 객체의 내용을 문자열로 표현한 후,
//        // 해당 문자열의 해시 코드를 반환
//        // hashCode() = 객체를 고유하게 식별하는 정수값을 반환
//
//        // HashSet 클래스의 remove() 메소드는 먼저 hashCode()를 호출하여
//        // 해당 객체의 해시 코드를 기반으로 검색을 수행한 후,
//        // 해당 해시 코드와 같은 값을 가진 객체를 찾음
//
//        // toString()의 값만으로 비교하더라도 두 객체가 같다면 같은 해시 코드를 가짐
//        // Object 클래스에 있는 hashCode()의 반환형이 int형이기 때문에,
//        // toString().hashCode()를 사용하여 동일한 값을 반환
    }
}
