package com.java.GenericExam;

public class Corn <T>{ // T에는 여러 자료형이 들어올 수 있음
    private T t; // 받은 자료형만을 처리할 수 있음
    public T get(){ //받은 자료형의 값을 리턴
        return t;
    }
    public void set(T t){ // 받은 자료형의 값을 재설정
        this.t = t;
    }
}
