package headfirst.designpatterns.strategy;

public class FlyWithWings implements FlyBehavior {
  public void fly() {
    System.out.println("fly with wings..!");
  }
}