package headfirst.designpatterns.decorator.starbuzz;

public class Milk extends CondimentDecorator{
  Beverage beverage;
  public Milk(Beverage beverage){
    this.beverage = beverage;
  } 
  public String getDescription(){
    return beverage.getDescription()+" adding Milk";
  }
  public double cost(){
    return 1.0+ beverage.cost();
  }

}