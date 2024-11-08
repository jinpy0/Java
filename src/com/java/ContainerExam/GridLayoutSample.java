package com.java.ContainerExam;

import javax.swing.*;
import java.awt.*;

public class GridLayoutSample extends JFrame {
    public GridLayoutSample() {
        Container ct = getContentPane();
        GridLayout gl = new GridLayout(4, 5, 10, 10); // 4 * 5 크기
        ct.setLayout(gl);
        for (int i = 1; i <= 20; i++) {
            ct.add(new JButton("버튼" + i));
        }
        setTitle("GridLayout Sample");
        setSize(800, 800);
        setVisible(true);
    }
}
