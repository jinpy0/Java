package com.java.ex10_기말;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String song = "천번이고 다시 태어난 데도 그런 사람 또 없을테죠\r\n"
                +"슬픈 내 삶을 따뜻하게 해준 참 고마운 사람입니다\r\n"
                +"그런 그댈 위해서 나의 심장쯤이야 얼마든 아파도 좋은데";

        char[] input = new char[song.length()];
        // String 의 크기만큼 배열의 크기를 지정해 줌.
       
        song.getChars(0, song.length(), input, 0);
        // 문자열을 문자 배열로 생성
        // getChars -> 문자열을 배열에 하나씩 집어넣음.
        // getChars(시작 인덱스, 끝 인덱스=1, 저장 될 배열변수 이름, 배열변수 몇 번째 인덱스부터 값을 넣어라)
        
        System.out.print("파일명 입력(.txt 는 생략) : ");
        String filename = sc.next() +".txt";

        FileWriter fw = new FileWriter(filename);
        fw.write(song);
        fw.close();
        System.out.println(filename + " 파일이 생성되었습니다.");

        System.out.print("읽어 들일 파일 명 입력(.txt 는 생략 ) : ");
        String inputFileName = sc.next() +".txt";
        FileReader fr = new FileReader(inputFileName);
        int ch;
        while ((ch = fr.read()) != -1) {
            // 파일에서 한 문자씩 읽어들임 , -1 은 값이 없다는 뜻
            System.out.print((char)ch);
            // 읽은 문자 출력
        }
        fr.close();
    }
}
