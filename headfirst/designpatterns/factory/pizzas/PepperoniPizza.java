package headfirst.designpatterns.factory.pizzas;

public class PepperoniPizza extends Pizza{
  public PepperoniPizza(){
    name = "Pepperoni Pizza";
    dough = "Regular Crust";
    sauce = "Marinara Pizza Sauce";
    topings.add("Pepperoni");
    topings.add("Parmesan");
  }

}