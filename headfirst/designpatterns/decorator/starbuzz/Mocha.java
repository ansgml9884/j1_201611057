package headfirst.designpatterns.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
  Beverage beverage;
  public Mocha(Beverage beverage){
    this.beverage = beverage;
  } // black diamond. getDescription & cost 사용하려고 Beverage(Super class) 생성자로 가져옴
  public String getDescription(){
    return beverage.getDescription()+" adding Mocha";
  }
  public double cost(){
    return .20 + beverage.cost();
  }

}