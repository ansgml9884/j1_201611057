package headfirst.designpatterns.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
  Beverage beverage;
  public Mocha(Beverage b){
    this.beverage = beverage;
  } // black diamond. getDescription & cost ����Ϸ��� Beverage(Super class) �����ڷ� ������
  public String getDescription(){
    return beverage.getDescription()+" adding Mocha";
  }
  public double cost(){
    return beverage.cost()+0.2;
  }

}