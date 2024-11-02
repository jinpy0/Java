package com.java.ex07.main;

import com.java.ex07.robot.CheapRobot;
import com.java.ex07.robot.StandardRobot;
import com.java.ex07.robot.SuperRobot;
import com.java.ex07.sword.SwordIron;

public class MainClass {
    public static void main(String[] args) {
        SuperRobot spr = new SuperRobot();
        spr.robotMake();
        spr.walk();
        spr.run();
        spr.actionSword();
        spr.setSword(new SwordIron()); // 새로운 생성자로 바꿔야함
        spr.actionSword(); // == spr.sword.sword();
        spr.actionFire(); // == spr.fire.fire();
        spr.actionWing(); // == spr.wing.wing();

        StandardRobot str = new StandardRobot();
        str.robotMake();
        str.walk();
        str.run();
        str.actionFire();
        str.actionSword();
        str.actionWing();

        CheapRobot chr = new CheapRobot();
        chr.robotMake();
        chr.walk();
        chr.run();
        chr.actionFire();
        chr.actionSword();
        chr.actionWing();

    }
}
