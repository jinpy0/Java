package com.java.ex11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// AWS 사용

public class MakeFrame01 extends Frame implements ActionListener {
    private List list;
    private Panel panel;
    private TextField textField;
    private Button okBt;
    private Button exitBt;

    public MakeFrame01() {
        list = new List();
        panel = new Panel();
        textField = new TextField(20); // 필드의 크기가 20개의 글자가 들어갈 수 있는
        okBt = new Button("OK");
        exitBt = new Button("Exit");

        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH); // 보더 레이아웃을 사용, (북쪽으로)panel 을 추가
        add(list, BorderLayout.CENTER); // 보더 레이아웃을 사용, (중앙에)list 를 추가
        panel.add(new Label("write")); // panel 에 Label 생성자를 사용해 생성, write 라는 텍스트 추가
        panel.add(textField); // textField 추가
        panel.add(okBt); // ok 버튼 추가
        panel.add(exitBt); // exit 버튼 추가

//        Listener : 어떤 이벤트가 발생할 때 그 이벤트를 잡아오는 것
        okBt.addActionListener(this); // Ok 버튼 클릭 시 실행되는 메소드 ( actionPerformed 메소드 호출 )
        exitBt.addActionListener(this); // Exit 버튼 클릭 시
        addWindowListener(new WindowAdapter() { // 윈도우 창 이벤트 처리
           @Override
           public void windowClosing(WindowEvent e) { // windowClosing : window 창에서 X 버튼을 눌렀을 때
               setVisible(false);
               dispose();
               System.exit(0);
           }
        });
    }
    // 까지 생성자

    // 인터페이스 오버라이딩
    // Event : Listener 에 잡힌 이벤트를 처리
    @Override
    public void actionPerformed(ActionEvent e) {  // 클릭 이벤트를 처리하는 메소드
        if(e.getSource() == okBt) {
            list.add(textField.getText()); // Ok 버튼 클릭 시 textField 내용을 list 에 추가
        }
        else if(e.getSource() == exitBt) { // Exit 버튼 클릭 시
            setVisible(false);
            dispose();
            System.exit(0);
        }
    }
}
