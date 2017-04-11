package headfirst.designpatterns.decorator.starbuzz;

public class Whip extends CondimentDecorator{
  Beverage beverage;
  public Whip(Beverage b){
    this.beverage = beverage;
  } // black diamond. getDescription & cost 사용하려고 Beverage(Super class) 생성자로 가져옴
  public String getDescription(){
    return beverage.getDescription()+" adding Whip";
  }
  public abstract double cost(){
    return beverage.cost()+0.1;
  }

}