package com.java.ex10_기말;

import java.io.File;

public class FileExam {
    public static void main(String[] args) {
        String directory = "C:/Windows"; // C 드라이브의 Windows 폴더를 directory 변수에 저장
        File f1 = new File(directory); // directory 변수로 File 클래스의 f1 인스턴스 생성
        if (f1.isDirectory()) { // f1 인스턴스가 디렉토리인가 ( 참 or 거짓 반환 )
            System.out.println("탐색 디렉토리 " + directory);
            System.out.println("==================");
            String[] list = f1.list(); // 목록을 받아와 배열 변수 list 에 저장
            for (int i = 0; i < list.length; i++) {
                File f2 = new File(directory + "/" + list[i]); 
                // 디렉토리 안에 있는 파일들을 다 list 변수에 저장하고
                // list 변수에 저장된 리스트 중 첫 번째
                if (f2.isDirectory()) {
                    System.out.println(list[i] + "--> is Directory");
                } else {
                    System.out.println(list[i] + "--> is File");
                }
            }
        } else {
            System.out.println("지정한 " + directory + " 는 디렉토리가 아닙니다!");
        }
        System.out.println("");
        System.out.println("==================");
        System.out.println("");

        File f3 = new File("C:\\Users\\jinpy\\OneDrive\\바탕 화면\\진표:/test.txt");
        System.out.println("파일 이름 : " + f3.getName());
        System.out.println("파일 경로 : " + f3.getPath());
        System.out.println("절대 경로 : " + f3.getAbsolutePath());
        System.out.println(f3.exists() ? "파일존재" : "파일없음");
        System.out.println(f3.canWrite() ? "수정가능" : "수정불가");
        System.out.println(f3.canRead() ? "읽기가능" : "읽기불가");
        System.out.println(f3.isDirectory() ? "디렉토리" : "디렉토리아님");
        System.out.println(f3.isFile() ? "파일" : "파일아님");
        System.out.println(f3.isAbsolute() ? "절대경로" : "상대경로");
        System.out.println("2024.10.28 기준 밀리초 단위 최종 수정시간 : " + f3.lastModified());
        System.out.println("파일크기 : " + f3.length() + "bytes");

    }
}
