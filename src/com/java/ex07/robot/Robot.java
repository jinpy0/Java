package com.java.ex07.robot;

import com.java.ex07.fire.Fire;
import com.java.ex07.sword.Sword;
import com.java.ex07.wing.Wing;

public abstract class Robot {

//    private 를 제외한 모든 접근 제한자 ( 상속 받아서 쓰기 위해 )
    public Fire fire; // 인터페이스나 추상클래스로 인스턴스를 만들 땐 하위 객체의 생성자를 사용해야 함.
    public Sword sword; // 인터페이스나 추상클래스엔 생성자를 구현할 수 없기 때문
    public Wing wing;

    public Robot() {
        System.out.println("머리, 몸통, 팔, 손, 다리, 발 조립 완료!");
        System.out.println("로봇 조립 완성!");
    }
//    Robot 만들기 완성
    public abstract void robotMake();
//
    public void walk() {
        System.out.println("걷기 : OK");
    }

    public void run() {
        System.out.println("달리기 : OK");
    }
//    getters / setters
    public Fire getFire() {
        return fire;
    }

    public void setFire(Fire fire) {
        this.fire = fire;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

//    기능 출력
    public void actionFire(){
        this.fire.fire();
    }

    public void actionSword(){
        this.sword.sword();
    }

    public void actionWing(){
        this.wing.wing();
    }

}
