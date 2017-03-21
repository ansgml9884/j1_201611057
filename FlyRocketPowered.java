package headfirst.designpatterns.strategy;

public class FlyRocketPowered implements FlyBehavior {
  public void fly() {
    System.out.println("fly with a rocket..!");
   }
}