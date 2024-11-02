package com.java.ex08;

import java.util.Calendar;

public class CalendarExam {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); // Singleton 패턴
        //시스템 시간을 다루는 클래스.
        
        int year = cal.get(Calendar.YEAR); // YEAR = 클래스 변수 ( static 키워드 사용 )
        int month = cal.get(Calendar.MONTH) + 1; // 월은 시작이 0부터라 +1을 해줌
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println("현재 시각입니다!");
        System.out.println(year + "년 " + month + "월" + day + "일");
        System.out.println(hour + "시" + minute + "분" + second + "초");
    }
}
