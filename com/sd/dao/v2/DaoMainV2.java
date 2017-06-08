package com.sd.dao.v2;

import java.util.List;
import java.util.Iterator;

public class DaoMainV2{
  public static void main(String args[]){
    PersonDaoImpl personDaoImpl = new PersonDaoImpl();
    PersonV0 person = new PersonV0();
    
    person.setName("mh1");
    person.setAddress("1 pyeongchang");
    personDaoImpl.insert(person);
    
    person.setName("mh2");
    person.setAddress("2 pyeongchang");
    personDaoImpl.insert(person);
    
    List persons = personDaoImpl.findAll();
    Iterator iter = persons.iterator();
    while(iter.hasNext()){
      person = (PersonV0)iter.next();
      System.out.println(person.toString());
    }
    
    personDaoImpl.delete(1);
    person.setId(2);
    person.setName("mh2 updated");
    person.setAddress("2 pyeongchang updated");
    personDaoImpl.update(person);
    
    person = personDaoImpl.findById(2);
    System.out.println("found by id..."+person);
    
    personDaoImpl.close();
  
  }

}