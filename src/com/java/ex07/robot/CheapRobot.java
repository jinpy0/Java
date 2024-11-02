package com.java.ex07.robot;

import com.java.ex07.fire.FireNo;
import com.java.ex07.sword.SwordNo;
import com.java.ex07.wing.WingNo;

public class CheapRobot extends Robot{

    public CheapRobot() {
        fire = new FireNo();
        sword = new SwordNo();
        wing = new WingNo();
    }

    @Override
    public void robotMake() {
        System.out.println("-----싼 로봇 제작-----");
    }
}
