package com.sd.dao.v2;

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
      pstmt = conn.prepareStatement("INSERT INTO persons(id,name,address) VALUES(NULL,?,?)");
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getAddress());
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
      rs = stmt.executeQuery("select * from persons");
      PersonV0 p = null;
      while(rs.next()){
        p = new PersonV0();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
        persons.add(p);
      }
    } catch(SQLException e) {
    e.printStackTrace();
    } finally {
        try {
          if(stmt !=null) stmt.close();
        } catch (Exception e) {};
      }
      System.out.println("* finding all..."+persons);
      return persons;
  }
    public PersonV0 findById(int id) {
      PersonV0 p = null;
      try {
        pstmt = conn.prepareStatement("select * from persons where id=?");
        pstmt.setInt(1, id);
        rs = pstmt.executeQuery();
        //if - set 하나일때 , while  - set 여러개 일 때
        if(rs.next()){
          p = new PersonV0();
          p.setId(rs.getInt("id"));
          p.setName(rs.getString("name"));
          p.setAddress(rs.getString("address"));
        }
      } catch(SQLException e){
        e.printStackTrace();
      }
      return p;
    }
    public void update(PersonV0 p) {
        try {
            pstmt = conn.prepareStatement("UPDATE persons SET name=?,address=? WHERE id=?"); 
            pstmt.setString(1, p.getName());
            pstmt.setString(2, p.getAddress());
            pstmt.setInt(3, p.getId());
            System.out.println("* updating..."+p.getName());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delete(int id) {
        try {
            pstmt = conn.prepareStatement("DELETE FROM persons WHERE id=?");
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