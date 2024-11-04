package com.java.ContainerExam;

import javax.swing.*;
import java.awt.*;

public class JPanelSample02 extends JFrame {
    public JPanelSample02() {
        Container ct = getContentPane();
        ct.setLayout(new BorderLayout(3,3));

        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(3,1));
        jp1.add(new JRadioButton("JAVA"));
        jp1.add(new JRadioButton("JSP"));
        jp1.add(new JRadioButton("Spring"));

        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(3,1));
        jp2.add(new JRadioButton("JAVA"));
        jp2.add(new JRadioButton("JSP"));
        jp2.add(new JRadioButton("Spring"));

        ct.add(jp1, BorderLayout.EAST);
        ct.add(jp2, BorderLayout.WEST);

        setTitle("JPanel Sample2");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
