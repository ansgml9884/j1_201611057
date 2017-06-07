package com.sd.addressFinal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PersonDaoImpl implements PersonDao{
  Connection conn = ConnectionFactory.getConnection();
  PreparedStatement pstmt = null;
  ResultSet rs  = null;
  public void insert(PersonV0 p){
    try {
      pstmt = conn.prepareStatement("INSERT INTO people(id,name,address,phoneNum) VALUES(NULL,?,?,?)");
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getAddress());
      pstmt.setString(3,p.getPhoneNum());
      System.out.println("inserting..."+p.getName());
      pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  public List<PersonV0> findAll(){
    Statement stmt = null;
    List<PersonV0> persons = new ArrayList<PersonV0>();
    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery("select * from people");
      PersonV0 p = null;
      while(rs.next()){
        p = new PersonV0();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
        p.setPhoneNum(rs.getString("phoneNum"));
        persons.add(p);
      }
    } catch(SQLException e) {
    e.printStackTrace();
    } finally {
        try {
          if(stmt !=null) stmt.close();
        } catch (Exception e) {};
      }
    //  System.out.println("* finding all..."+persons);
      return persons;
  }
    public PersonV0 findById(int id) {
      PersonV0 p = null;
      try {
        pstmt = conn.prepareStatement("select * from people where id=?");
        pstmt.setInt(1, id);
        rs = pstmt.executeQuery();
        //if - set 하나일때 , while  - set 여러개 일 때
        while(rs.next()){
          p = new PersonV0();
          p.setId(rs.getInt("id"));
          p.setName(rs.getString("name"));
          p.setAddress(rs.getString("address"));
          p.setPhoneNum(rs.getString("phoneNum"));
        }
      } catch(SQLException e){
        e.printStackTrace();
      }
      return p;
    }
    public PersonV0 findByName(String name) {
      PersonV0 p = null;
      try {
        pstmt = conn.prepareStatement("select * from people where name=?");
        pstmt.setString(1, name);
        rs = pstmt.executeQuery();
        //if - set 하나일때 , while  - set 여러개 일 때
        while(rs.next()){
          p = new PersonV0();
          p.setId(rs.getInt("id"));
          p.setName(rs.getString("name"));
          p.setAddress(rs.getString("address"));
          p.setPhoneNum(rs.getString("phoneNum"));
        }
      } catch(SQLException e){
        e.printStackTrace();
      }
      return p;
    }
    public void update(PersonV0 p) {
        try {
            pstmt = conn.prepareStatement("UPDATE people SET name=?,address=?,phoneNum=? WHERE id=?"); 
            pstmt.setString(1, p.getName());
            pstmt.setString(2, p.getAddress());
            pstmt.setString(3, p.getPhoneNum());
            pstmt.setInt(4, p.getId());
            System.out.println("* updating..."+p.getName());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delete(int id) {
        try {
            pstmt = conn.prepareStatement("DELETE FROM people WHERE id=?");
            pstmt.setInt(1, id);
            int rows = pstmt.executeUpdate();
            if(rows == 0 ){
              System.out.println("can not delete...");
            }else if(rows>0){
             System.out.println("deleting..."+id);
            }
        }catch(SQLException e){}
    }
    public void delete(PersonV0 p){}
    public void close() {
      System.out.println("closeing all...");
      try{
        if(rs != null) rs.close();
        if(pstmt != null) pstmt.close();
        if(conn != null) conn.close();
      } catch (Exception e){};
    }
}