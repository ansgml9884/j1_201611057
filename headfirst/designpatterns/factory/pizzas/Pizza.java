package headfirst.designpatterns.factory.pizzas;

import java.util.ArrayList;

public class Pizza {
  String name;
  String dough;
  String sauce;
  ArrayList <String> topings = new ArrayList<String>();
  
  public String getName(){
    return name;
  }
  
  public void prepare(){
    System.out.println("Preparing "+name);
  }

  public void bake(){
    System.out.println("Baking "+name);
  }
  
  public void cut(){
    System.out.println("Cutting "+name);
  }
  
  public void box(){
    System.out.println("Boxing "+name);
  }
  public String toString(){
    StringBuffer display = new StringBuffer();
    display.append("----" + name + "----\n");
    display.append(dough+"\n");
    display.append(sauce+"\n");
    for(int i=0; i<topings.size();i++){
      display.append((String)topings.get(i)+"\n");
    }
    return display.toString();
  }
}