package com.java.ex10_기말;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamExam {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("C:\\JavaSource\\Java02\\song.txt");
            String str = "you raise me up";
            byte[] bs = str.getBytes();
            os.write(bs);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
