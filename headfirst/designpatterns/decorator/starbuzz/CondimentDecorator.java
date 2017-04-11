package headfirst.designpatterns.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage{
  public abstract String getDescription(); // delay
  //public abstract double cost(); 자식으로 delay

}