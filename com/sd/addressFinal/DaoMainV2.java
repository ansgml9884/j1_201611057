package com.sd.addressFinal;

import java.util.List;
import java.util.Iterator;

public class DaoMainV2{
  PersonDaoImpl personDaoImpl = new PersonDaoImpl();
  PersonV0 person = new PersonV0();
  
  public void insert(String name, String address, String phoneNum)
  {    
    person.setName(name);
    person.setAddress(address);
    person.setPhoneNum(phoneNum);
    personDaoImpl.insert(person);
  }
  
  public void update(int id, String name, String address, String phoneNum)
  {    
    person.setId(id);
    person.setName(name);
    person.setAddress(address);
    person.setPhoneNum(phoneNum);
    personDaoImpl.update(person);
  }
  
  public void search(int id)
  {    
    person = personDaoImpl.findById(id);
    System.out.println("found by id..."+person);
  }
  public void search(String name)
  {    
    person = personDaoImpl.findByName(name);
    System.out.println("found by name..."+person);
  }
  public void delete(int id)
  {    
    personDaoImpl.delete(id);
  }
  
  public void findAll(){
    List persons = personDaoImpl.findAll();
    Iterator iter = persons.iterator();
    while(iter.hasNext()){
      person = (PersonV0)iter.next();
      System.out.println(person.toString());
    }
  }   
  //personDaoImpl.close();
}
