package com.java.ex11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Swing 사용

public class MakeComponent extends JFrame implements ActionListener {
    JPanel jPanel;
    JLabel jLabel;
    JLabel jLabelBlank;
    JButton jButton;
    JButton jButtonExit;
    JTextField jTextField;
    JComboBox<String> jComboBox; // 선택지로 String 자료형만 받음 ( String 타입 요소들로만 이루어진 선택 박스 )
    JCheckBox jCheckBox;
    String[] items = {"일진표", "이진표", "삼진표"}; // jComboBox 에 들어갈 요소 배열

    public MakeComponent() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // JVM 이 가지고 있는 WindowClosing 처리를 JFrame 에서는 이렇게 처리 ( JFrame 이 닫힐 때 JVM 종료 )
        jPanel = (JPanel)getContentPane(); // JPanel 의 ContentPane 을 JPanel 로 설정
        jPanel.setLayout(new FlowLayout()); // FlowLayout : 앞에서 부터 정렬 ( 왼쪽 -> 오른쪽 )
        jLabel = new JLabel("라벨");
        jButton = new JButton("버튼");
        jTextField = new JTextField(20);
        jComboBox = new JComboBox<String>(items); // items 배열에 있는 값으로 생성( 초기화 ) 된 JComboBox
        jCheckBox = new JCheckBox("체크박스");
        jLabelBlank = new JLabel(); // 텍스트를 추가하기 위한 빈 라벨
        jButtonExit = new JButton("Exit"); // 종료 버튼
        
        // 생성한 요소들을 jPanel 에 추가
        jPanel.add(jLabel);
        jPanel.add(jButton);
        jPanel.add(jTextField);
        jPanel.add(jComboBox);
        jPanel.add(jCheckBox);
        jPanel.add(jLabelBlank);
        jPanel.add(jButtonExit);
    
        // 사이즈 설정
        jLabel.setPreferredSize(new Dimension(50, 50));
        jButton.setPreferredSize(new Dimension(100, 50));
        jTextField.setPreferredSize(new Dimension(300, 50));
        jComboBox.setPreferredSize(new Dimension(100, 50));
        jCheckBox.setPreferredSize(new Dimension(100, 50));
        jLabelBlank.setPreferredSize(new Dimension(200, 50));
        jButtonExit.setPreferredSize(new Dimension(100, 50));
        
        // 버튼이 눌렸을 때 이벤트 발생시키기
        jButton.addActionListener(this);
        jButtonExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jButton) {
            jLabelBlank.setText(jTextField.getText());
            // jButton 이 눌렸을 때 jLabelBlank 에 텍스트 필드에 있는 텍스트를 추가
        }else if(e.getSource() == jButtonExit) {
            setVisible(false);
            dispose();
            System.exit(0);
        }
    }
}
