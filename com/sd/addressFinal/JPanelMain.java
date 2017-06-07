package com.sd.addressFinal;

import javax.swing.*;
import java.awt.event.*;

class JPanelmenu extends JPanel{

  private JButton bt1, bt2, bt3, bt4; 
  private JPanelMain win;
  private JLabel label1, label2;
  public JPanelmenu(JPanelMain win){

    setLayout(null);
    this.win = win;
    label1 = new JLabel("실행할 메뉴를 선택하세요");
    bt1 = new JButton("Insert"); 
    bt2 = new JButton("Update"); 
    bt3 = new JButton("Delete"); 
    bt4 = new JButton("Search"); 
    label1.setSize(250,30); label1.setLocation(180,50);   
    bt1.setSize(110,60); bt1.setLocation(10,100);    
    bt2.setSize(110,60); bt2.setLocation(130,100);
    bt3.setSize(110,60); bt3.setLocation(250,100);
    bt4.setSize(110,60); bt4.setLocation(370,100);
    
    add(label1); add(bt1); add(bt2); add(bt3); add(bt4); 
    bt1.addActionListener(new myActionListener()); 
    bt2.addActionListener(new myActionListener()); 
    bt3.addActionListener(new myActionListener()); 
    bt4.addActionListener(new myActionListener());  

  }
  class myActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) { 
      JButton bt = (JButton)e.getSource(); 
      if (bt == bt1) { 
        win.change("panel01"); 
      } 
       else if (bt == bt2) { 
        win.change("panel02");
      }
      else if (bt == bt3) {
        win.change("panel03");
      }
      else if (bt == bt4) {
        win.change("panel04");
      }

    } 
  }
}
class JPanel01 extends JPanel{

  private JLabel label1, label2, label3;
  private JButton bt1, bt2; 
  private JTextField tf1, tf2, tf3;
  private JPanelMain win;
  private DaoMainV2 dao;
  private String name, address, phoneNum;
  public JPanel01(JPanelMain win, DaoMainV2 dao){

    setLayout(null);
    this.win = win;
    this.dao = dao; 
    label1 = new JLabel(" N A M E : "); 
    label2 = new JLabel(" A D D R E S S  : "); 
    label3 = new JLabel(" P H O N E  : "); 
    
    tf1 = new JTextField(10); 
    tf2 = new JTextField(20); 
    tf3 = new JTextField(20); 
    
    bt1 = new JButton("Insert"); 
    bt1.addActionListener(new myActionListener());  
    bt2 = new JButton("Back"); 
    bt2.addActionListener(new myActionListener());  
    
    label1.setSize(100,20); label1.setLocation(50,40);  
    label2.setSize(100,20); label2.setLocation(50,80);  
    label3.setSize(100,20); label3.setLocation(50,120);  
    
    tf1.setSize(230,20); tf1.setLocation(200,40);
    tf2.setSize(230,20); tf2.setLocation(200,80);
    tf3.setSize(230,20); tf3.setLocation(200,120);
        
    bt1.setSize(100,30); bt1.setLocation(150,160);
    bt2.setSize(100,30); bt2.setLocation(260,160);

    add(label1); add(label2); add(label3);
    add(tf1); add(tf2); add(tf3);
    add(bt1); add(bt2);  

  }
  class myActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) { 
      JButton bt = (JButton)e.getSource(); 
      if (bt == bt1) { 
        name = tf1.getText();
        address = tf2.getText();
        phoneNum = tf3.getText();
        dao.insert(name, address, phoneNum);
        tf1.setText(""); 
        tf2.setText(""); 
        tf3.setText("");
        dao.findAll();
      } else if(bt == bt2) { 
        win.change("panelmenu");
     }
    }
  }
}
class JPanel02 extends JPanel{

  private JLabel label1, label2, label3, label4;
  private JButton bt1, bt2; 
  private JTextField tf1, tf2, tf3, tf4;
  private JPanelMain win;
  private DaoMainV2 dao;
  private Integer id;
  private String name, address, phoneNum;
  public JPanel02(JPanelMain win, DaoMainV2 dao){

    setLayout(null);
    this.win = win;
    this.dao = dao;
    label1 = new JLabel("I D : ");
    label2 = new JLabel(" N A M E : "); 
    label3 = new JLabel(" A D D R E S S  : "); 
    label4 = new JLabel(" P H O N E  : "); 
    
    tf1 = new JTextField(10); 
    tf2 = new JTextField(20); 
    tf3 = new JTextField(20); 
    tf4 = new JTextField(20);
    
    bt1 = new JButton("Update"); 
    bt1.addActionListener(new myActionListener());  
    bt2 = new JButton("Back"); 
    bt2.addActionListener(new myActionListener());  
    
    label1.setSize(100,20); label1.setLocation(50,30);
    label2.setSize(100,20); label2.setLocation(50,60);  
    label3.setSize(100,20); label3.setLocation(50,90);  
    label4.setSize(100,20); label4.setLocation(50,120);  
    
    tf1.setSize(230,20); tf1.setLocation(200,30);
    tf2.setSize(230,20); tf2.setLocation(200,60);
    tf3.setSize(230,20); tf3.setLocation(200,90);
    tf4.setSize(230,20); tf4.setLocation(200,120);
        
    bt1.setSize(100,30); bt1.setLocation(150,160);
    bt2.setSize(100,30); bt2.setLocation(260,160);

    add(label1); add(label2); add(label3); add(label4);
    add(tf1); add(tf2); add(tf3); add(tf4);
    add(bt1); add(bt2);  

  }
  class myActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) { 
      JButton bt = (JButton)e.getSource(); 
      if (bt == bt1) {
        id = Integer.parseInt(tf1.getText());
        name = tf2.getText();
        address = tf3.getText();
        phoneNum = tf4.getText();
        dao.update(id,name, address, phoneNum);
        tf1.setText(""); 
        tf2.setText(""); 
        tf3.setText("");
        tf4.setText("");
        dao.findAll();
      } else if(bt == bt2) { 
        win.change("panelmenu");
     }
    }
  }
}
class JPanel03 extends JPanel{

  private JLabel label1;
  private JButton bt1, bt2; 
  private JTextField tf1;
  private JPanelMain win;
  private DaoMainV2 dao;
  private Integer id;
  public JPanel03(JPanelMain win, DaoMainV2 dao){
    setLayout(null);
    this.win = win;
    this.dao = dao; 
    label1 = new JLabel(" I D : ");     
    tf1 = new JTextField(10); 
    bt1 = new JButton("Delete"); 
    bt1.addActionListener(new myActionListener());  
    bt2 = new JButton("Back"); 
    bt2.addActionListener(new myActionListener());  
    
    label1.setSize(100,20); label1.setLocation(100,80);  
    tf1.setSize(230,20); tf1.setLocation(200,80);
        
    bt1.setSize(100,30); bt1.setLocation(150,140);
    bt2.setSize(100,30); bt2.setLocation(260,140);

    add(label1); add(tf1);
    add(bt1); add(bt2);  

  }
  class myActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) { 
      JButton bt = (JButton)e.getSource(); 
      if (bt == bt1) { 
        id = Integer.parseInt(tf1.getText());
        dao.delete(id);
        tf1.setText(""); 
        dao.findAll();
      } else if(bt == bt2) { 
        win.change("panelmenu");
     }
    }
  }
}

class JPanel04 extends JPanel{

  private JButton bt1, bt2, bt3; 
  private JPanelMain win;
  public JPanel04(JPanelMain win){
    setLayout(null);
    this.win = win;
    
    bt1 = new JButton(" Search By ID "); 
    bt1.addActionListener(new myActionListener());  
    bt2 = new JButton(" Search By Name "); 
    bt2.addActionListener(new myActionListener());  
    bt3 = new JButton(" Back "); 
    bt3.addActionListener(new myActionListener());  
    
    bt1.setSize(150,40); bt1.setLocation(100,80);
    bt2.setSize(150,40); bt2.setLocation(270,80);
    bt3.setSize(100,30); bt3.setLocation(200,150);

    add(bt1); add(bt2); add(bt3);  

  }
  class myActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) { 
      JButton bt = (JButton)e.getSource(); 
      if (bt == bt1) { 
        win.change("panel04_1");
      } else if(bt == bt2) { 
        win.change("panel04_2");
      } else if(bt ==bt3){
        win.change("panelmenu");
      }
    }
  }
}
class JPanel04_1 extends JPanel{
  private JLabel label1;
  private JButton bt1, bt2; 
  private JTextField tf1;
  private JPanelMain win;
  private DaoMainV2 dao;
  private Integer id;
  public JPanel04_1(JPanelMain win, DaoMainV2 dao){
    setLayout(null);
    this.win = win;
    this.dao = dao; 
    label1 = new JLabel(" I D : ");     
    tf1 = new JTextField(10); 
    bt1 = new JButton("Search"); 
    bt1.addActionListener(new myActionListener());  
    bt2 = new JButton("Back"); 
    bt2.addActionListener(new myActionListener());  
    
    label1.setSize(100,20); label1.setLocation(100,80);  
    tf1.setSize(230,20); tf1.setLocation(200,80);
        
    bt1.setSize(100,30); bt1.setLocation(150,140);
    bt2.setSize(100,30); bt2.setLocation(260,140);

    add(label1); add(tf1);
    add(bt1); add(bt2);  
  }
  class myActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) { 
      JButton bt = (JButton)e.getSource(); 
      if (bt == bt1) { 
        id = Integer.parseInt(tf1.getText());
        dao.search(id);
        tf1.setText(""); 
      } else if(bt == bt2) { 
        win.change("panel04");
     }
    }
  }
}
class JPanel04_2 extends JPanel{

 private JLabel label1;
  private JButton bt1, bt2; 
  private JTextField tf1;
  private JPanelMain win;
  private DaoMainV2 dao;
  private String name;
  public JPanel04_2(JPanelMain win, DaoMainV2 dao){
    setLayout(null);
    this.win = win;
    this.dao = dao; 
    label1 = new JLabel(" N A M E : ");     
    tf1 = new JTextField(10); 
    bt1 = new JButton("Search"); 
    bt1.addActionListener(new myActionListener());  
    bt2 = new JButton("Back"); 
    bt2.addActionListener(new myActionListener());  
    
    label1.setSize(100,20); label1.setLocation(100,80);  
    tf1.setSize(230,20); tf1.setLocation(200,80);
        
    bt1.setSize(100,30); bt1.setLocation(150,140);
    bt2.setSize(100,30); bt2.setLocation(260,140);

    add(label1); add(tf1);
    add(bt1); add(bt2);  
  }
  class myActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e) { 
      JButton bt = (JButton)e.getSource(); 
      if (bt == bt1) { 
        name = tf1.getText();
        dao.search(name);
        tf1.setText(""); 
      } else if(bt == bt2) { 
        win.change("panel04");
     }
    }
  }
}
class JPanelMain extends JFrame{
  public JPanelmenu jpanelm = null;
  public JPanel01 jpanel01 = null;
  public JPanel02 jpanel02 = null;
  public JPanel03 jpanel03 = null;
  public JPanel04 jpanel04 = null;
  public JPanel04_1 jpanel04_1 = null;
  public JPanel04_2 jpanel04_2 = null;
  
  public void change(String panelName){
    if(panelName.equals("panelmenu")){
      getContentPane().removeAll();
      getContentPane().add(jpanelm);
    }else if(panelName.equals("panel01")){
      getContentPane().removeAll();
      getContentPane().add(jpanel01);
    } else if(panelName.equals("panel02")){
      getContentPane().removeAll();
      getContentPane().add(jpanel02);
    } else if(panelName.equals("panel03")){
      getContentPane().removeAll();
      getContentPane().add(jpanel03);
    } else if(panelName.equals("panel04")){
      getContentPane().removeAll();
      getContentPane().add(jpanel04);
    } else if(panelName.equals("panel04_1")){
      getContentPane().removeAll();
      getContentPane().add(jpanel04_1);
    } else if(panelName.equals("panel04_2")){
      getContentPane().removeAll();
      getContentPane().add(jpanel04_2);
    }
    revalidate();
    repaint();
  }
  
  public static void main(String[] args){
    DaoMainV2 dao = new DaoMainV2();
    JPanelMain win = new JPanelMain();
    win.setTitle("자바 주소록");
    win.jpanelm = new JPanelmenu(win);
    win.jpanel01 = new JPanel01(win,dao);
    win.jpanel02 = new JPanel02(win,dao);
    win.jpanel03 = new JPanel03(win,dao);
    win.jpanel04 = new JPanel04(win);
    win.jpanel04_1 = new JPanel04_1(win,dao);
    win.jpanel04_2 = new JPanel04_2(win,dao);
   
    win.add(win.jpanelm);
    win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    win.setSize(510,250);
    win.setVisible(true);
  }
}
  