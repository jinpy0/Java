package com.java.ex08;

public class TimeTest {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        String str = "A";
        long startNum1 = System.currentTimeMillis(); // 시작 시간을 저장

        for (int i = 0; i < 99999; i++) {
            str = str+ "A"; // 반복문을 돌 때마다 메모리를 할당하고 값을 집어넣음.
        }

        long endNum1 = System.currentTimeMillis(); // 끝난 시간을 저장 
        System.out.println("String 의 경과 시간 : " + (endNum1 - startNum1));

        StringBuilder sb = new StringBuilder("A");

        long startNum2 = System.currentTimeMillis();

        for (int i = 0; i < 99999; i++) {
            sb = sb.append("A"); // 반복문을 돌 때마다 전에 있던 문자열 뒤에 하나를 추가 ( 메모리를 따로 할당하지 않음 )
        }

        long endNum2 = System.currentTimeMillis();
        System.out.println("StringBuild 의 경과 시간 : " +  (endNum2 - startNum2));

    }
}
