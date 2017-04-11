package headfirst.designpatterns.decorator.starbuzz;

public class Whip extends CondimentDecorator{
  Beverage beverage;
  public Whip(Beverage beverage){
    this.beverage = beverage;
  } // black diamond. getDescription & cost ����Ϸ��� Beverage(Super class) �����ڷ� ������
  public String getDescription(){
    return beverage.getDescription() + " adding Whip";
  }
  public double cost(){
    return .10+ beverage.cost();
  }

}