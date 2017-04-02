package com.sd.gui;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class CalcAreaListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b=(JButton)e.getSource();
        String cmd=e.getActionCommand();
        if (cmd.equals("계산")) {
            System.out.println("계산 버튼");
            b.setText("계산했습니다");
        } else if (cmd.equals("취소")) {
            System.out.println("취소 버튼");
            b.setText("취소했습니다");
        } 
    }
}
