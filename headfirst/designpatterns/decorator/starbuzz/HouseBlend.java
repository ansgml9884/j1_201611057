package headfirst.designpatterns.decorator.starbuzz;

public class HouseBlend extends Beverage{
  public HouseBlend(){
    description="house blend coffee";
  }
  // public String getDescription(){
  //   return description;
  // }
  public double cost(){
    return 0.89;
  }
}