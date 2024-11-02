package com.java.inter.ex01;

public class InterImple implements Inter1, Inter2{

    @Override
    public int sum(int i, int j) {
        return i+j;
    }

    @Override
    public String getStr() {
        return str;
        // 인터페이스 상속을 받았기 때문에 상속된 인터페이스의 상수값 반환
    }
}
