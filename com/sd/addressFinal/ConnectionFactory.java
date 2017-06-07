package com.sd.addressFinal;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ConnectionFactory{
  private static Connection conn = null;
  private static Statement stmt=null;
  private ConnectionFactory(){}
  public static Connection getConnection(){ 
  
  try {
      String path = System.getProperty("user.dir");
      path += "\\src\\mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(
         prop.getProperty("URL")+"?useSSL=true",
         prop.getProperty("USER"),
         prop.getProperty("PASSWORD")
       );
      String mySql = "CREATE TABLE people(id int(64) NOT NULL AUTO_INCREMENT,";
      mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, phoneNum char(20) NOT NULL,UNIQUE (id))";
      stmt=conn.createStatement();
      stmt.execute(mySql);
      
    } catch (Exception e){
      e.printStackTrace();
    }
    return conn;
  }
}