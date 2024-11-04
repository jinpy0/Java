package com.java.ContainerExam;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutSample extends JFrame {
    public BorderLayoutSample() {
        Container ct = getContentPane();
        BorderLayout bl = new BorderLayout(10, 10);
        ct.setLayout(bl);
        ct.add(new JButton("right"), BorderLayout.EAST);
        ct.add(new JButton("left"), BorderLayout.WEST);
        ct.add(new JButton("top"), BorderLayout.NORTH);
        ct.add(new JButton("bottom"), BorderLayout.SOUTH);
        ct.add(new JButton("center"), BorderLayout.CENTER);
        setTitle("BorderLayout Sample");
        setSize(400,300);
        setVisible(true);
    }
}
