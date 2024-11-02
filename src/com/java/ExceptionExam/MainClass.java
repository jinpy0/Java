package com.java.ExceptionExam;

public class MainClass {
    public static void main(String[] args) {
        int i = 7;
        int j = 0;
        int[] k = new int[3];

        try{
            for (int l = 0; l < 3; l++) {
                k[l] = i; // 예외 발생
                System.out.println("k[" + l + "] : "  + k[l]);
            }
//            예외가 발생한 곳까지 실행
//            예외가 발생한 경우 Exception 클래스에 에러를 보냄 -> catch문 실행

            System.out.println(i+j);
            System.out.println(i-j);
            System.out.println(i*j);
            System.out.println(i/j); // 예외 발생
        }
        catch(Exception e){
            e.printStackTrace();
//            System.out.println(e);
            j = 7;
            System.out.println(i/j);
        }
        finally{
//            항상 실행되는 코드
            System.out.println("무조건 실행해야 하는 부분");
        }
    }
}
