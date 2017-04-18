package headfirst.designpatterns.factory.pizzas;

public class CheesePizza extends Pizza{
  public CheesePizza(){
    name = "Cheese Pizza";
    dough = "Regular Crust";
    sauce = "Marinara Pizza Sauce";
    topings.add("Fresh Mozzarella");
    topings.add("Parmesan");
  }

}