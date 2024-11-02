package com.java.ex11;

public class MainClass {
    public static void main(String[] args) {
        MakeButton btn = new MakeButton();
        btn.pack(); // 버튼 기본 사이즈
//        btn.setSize(500, 500); // 버튼 사이즈 설정
        btn.setVisible(true); // 버튼을 보이게 설정

        try{
            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        btn.setVisible(false); // 버튼을 안보이게 설정
        btn.dispose(); // 버튼 없애기

        try{
            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.exit(0);
    }
}
