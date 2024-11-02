package com.java.ExceptionExam;

public class ThrowsExClass {
    public ThrowsExClass() {
        actionC();
    }

    private void actionA() throws Exception {
//        오류 발생 시 이 함수를 호출한 곳에서 처리해라 ( throws )
        System.out.println("actionA");

        int[] iArr = {1, 2, 3, 4};
        System.out.println(iArr[4]);

        System.out.println("actionAAAA");
    }

    private void actionB() {
        System.out.println("actionB");

        try {
            actionA();
        } catch (Exception e) {
            System.out.println("예외 처리");
            System.out.println(e.getMessage());
        }
        System.out.println("actionBBBB");
    }

    private void actionC() {
        System.out.println("actionC");
        actionB();
        System.out.println("actionCCCC");
    }
}
