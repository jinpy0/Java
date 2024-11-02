package com.java.ex10_기말;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamExam {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        try{
            is = new FileInputStream("C:\\JavaSource\\Java02\\song.txt");
            os = new FileOutputStream("C:\\JavaSource\\Java02\\song.txt");

            byte[] bs = new byte[5];
            // 속도 향상을 위해 5개의 byte 씩 묶음

            while(true){
                int count = is.read(bs);
                if(count == -1){
                    break;
                }
                os.write(bs, 0, count);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if(is != null){
                try{
                    is.close();
                }
                catch(Exception e2){
                    System.out.println(e2.getMessage());
                }
            }
            if(os != null){
                try {
                    os.close();
                }
                catch(Exception e2){
                    System.out.println(e2.getMessage());
                }
            }
        }
    }
}
