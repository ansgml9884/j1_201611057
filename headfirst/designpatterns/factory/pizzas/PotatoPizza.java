package headfirst.designpatterns.factory.pizzas;

public class PotatoPizza extends Pizza{
  public PotatoPizza(){
    name = "Potato Pizza";
    dough = "Regular Crust";
    sauce = "Marinara Pizza Sauce";
    topings.add("Sliced Potato");
    topings.add("Parmesan");
  }

}