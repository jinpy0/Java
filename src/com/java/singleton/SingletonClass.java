package com.java.singleton;

public class SingletonClass {
//    private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();
    private static SingletonClass SINGLETON_CLASS_INSTANCE = null;
    private int i = 10;

    private SingletonClass() {} // 생성자에 private

    public static SingletonClass getSingletonClass() {
        // SingletonClass 형태를 가진 객체를 반환
        if(SINGLETON_CLASS_INSTANCE == null) { // 인스턴스가 생성되어있지 않다면
            SINGLETON_CLASS_INSTANCE = new SingletonClass(); // 새로운 인스턴스를 생성
        }
        return SINGLETON_CLASS_INSTANCE; // 인스턴스 반환
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }

}
