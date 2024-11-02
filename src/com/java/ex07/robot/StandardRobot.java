package com.java.ex07.robot;

import com.java.ex07.fire.FireRoket;
import com.java.ex07.sword.SwordIron;
import com.java.ex07.wing.WingNo;

import java.awt.*;

public class StandardRobot extends Robot {

    public StandardRobot(){
        fire = new FireRoket();
        sword = new SwordIron();
        wing = new WingNo();
    }

    @Override
    public void robotMake() {
        System.out.println("-----중간 로봇 제작-----");
    }
}
