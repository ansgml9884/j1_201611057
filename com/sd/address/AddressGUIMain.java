package com.sd.address;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddressGUIMain extends JFrame implements ActionListener { 
 private JPanel panel; 
 private JLabel label1, label2; 
 private JTextField tf1, tf2; 
 private JButton bt1, bt2; 
 private String name;
 private Integer phoneNum; 
 
 public AddressGUIMain() { 
   JFrame f=new JFrame();
   panel = new JPanel(new GridLayout(3, 2)); 
   getContentPane().add(panel); 

   label1 = new JLabel("Name",JLabel.CENTER); 
   label2 = new JLabel("Phone Number",JLabel.CENTER); 
   tf1 = new JTextField(10); 
   tf2 = new JTextField(10); 
   bt1 = new JButton("Save"); 
   bt2 = new JButton("Search"); 
   
   bt1.addActionListener(this); 
   bt2.addActionListener(this); 
   
   panel.add(label1); 
   panel.add(tf1); 
   panel.add(label2); 
   panel.add(tf2); 
   panel.add(bt1); 
   panel.add(bt2); 
 } 
  
 public void actionPerformed(ActionEvent e) { 
  JButton bt = (JButton)e.getSource(); 
  if (bt == bt1) { 
    name =tf1.getText();
    phoneNum = Integer.parseInt(tf2.getText());
    bt.setText("Complete"); 
  } 
  else if (bt == bt2) { 
    //tf1.setText("");
    //tf2.setText(""); 
  } 
 } 
  
 public static void main(String[] args) { 
   AddressGUIMain a = new AddressGUIMain(); 
  a.setDefaultCloseOperation(EXIT_ON_CLOSE); 
  a.pack(); 
  a.setSize(300,150);
  a.setVisible(true); 
 } 
} 
