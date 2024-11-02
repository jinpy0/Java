package com.java.ex10_기말;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExam {
    public static void main(String[] args) {
        try{ // 파일이 없을 수도 있으므로 try, catch 문으로 만듬
            InputStream is = new FileInputStream("C:\\JavaSource\\Java02\\song.txt");
            while(true){
                int i = is.read();
                System.out.println("데이터 : " + i);
                if(i == -1){ // 끝
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
