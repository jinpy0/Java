package com.java.ex02.child;

import com.java.ex02.papa.Papa;

public class Child2 {
    public void pping(int money){
        Papa.MONEY = Papa.MONEY - money;
    }
}
