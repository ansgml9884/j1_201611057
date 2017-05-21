package headfirst.designpatterns.command.undo;

public class DVD{
  public DVD(){}
  public void play(){
    System.out.println("DVD is playing");
  }
  public void stop(){
    System.out.println("DVD stopped");
  }
}