package headfirst.designpatterns.singleton.threadsafe;

public class SingletonMain{
  public static void main(String[] args){
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    
  }
}