package com.java.ContainerExam;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutSample extends JFrame {
    public FlowLayoutSample() {
        Container ct = getContentPane(); // 싱글톤
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 10, 15);  // 정렬 방식을 지정하는 상수, 수직 간격, 수평 간격
        ct.setLayout(fl);
        for (int i = 1; i <= 15; i++) {
            ct.add(new JButton("Button" + i));
        }
        setTitle("FlowLayout Sample"); // 창의 이름
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
