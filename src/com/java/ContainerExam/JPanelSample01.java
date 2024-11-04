package com.java.ContainerExam;

import javax.swing.*;
import java.awt.*;

// JPanel 사용 X

public class JPanelSample01 extends JFrame {
    public JPanelSample01() {
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        ct.add(new JRadioButton("Java"));
        ct.add(new JRadioButton("JSP"));
        ct.add(new JRadioButton("Spring"));
        ct.add(new JButton("Java"));
        ct.add(new JButton("JSP"));
        ct.add(new JButton("Spring"));
        setTitle("JPanel Sample01");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
