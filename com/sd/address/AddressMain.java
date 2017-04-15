package com.sd.address;

import java.util.Map;
import java.util.HashMap;

//GUI입력 데이터 저장 구현 -> 저장된 데이터 불러와서 사용

public class AddressMain {

  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<String, Integer>();  

    String[] B={"John", "Adam", "Skrien"};
    Integer[] C = {new Integer(1012345678), new Integer(1043218765), new Integer(1011076228)}; 

     for(int i=0; i<B.length; i++)
       map.put(B[i],C[i]);
      
      Comparator stringComp=new StringComparator();
      Sorter.sort(B, stringComp);

/* 전화번호 비교예정 (기존 정보와 중복여부) - 맨앞 '0'제거   
      Comparator integerComp=new IntegerComparator();
      Sorter.sort(C, integerComp);
*/   
        for(int i=0; i<B.length; i++)
          System.out.println(B[i]+" : 0"+ map.get(B[i]));  
    }
}