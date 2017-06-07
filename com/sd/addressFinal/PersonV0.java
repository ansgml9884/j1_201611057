package com.sd.addressFinal;

public class PersonV0 {
    private int id;
    private String name;
    private String address;
    private String phoneNum;
    
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    
    public void setId(int id) {
        this.id=id;
    }
    public int getId() {
        return id;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum=phoneNum;
    }
    public String getPhoneNum() {
        return phoneNum;
    }

    public String toString(){
      return "ID : "+id+" Name : "+name+" Address : "+address+" phoneNum : "+phoneNum;
    }
}