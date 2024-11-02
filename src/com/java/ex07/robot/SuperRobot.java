package com.java.ex07.robot;

import com.java.ex07.fire.FireLaser;
import com.java.ex07.sword.SwordLaser;
import com.java.ex07.wing.WingOk;

public class SuperRobot extends Robot {

    public SuperRobot() {
        // 생성자로 어떤 것들을 사용할 건지 명시적으로 써줘야 함
        fire = new FireLaser();
        sword = new SwordLaser();
        wing = new WingOk();
    }

    @Override
    public void robotMake() {
        System.out.println("-----비싼 로봇 제작-----");
    }

}


