package headfirst.designpatterns.factory.pizzafm;

public class SMPizzaStore extends PizzaStore{
  Pizza createPizza(String item) {
    if (item.equals("cheese")) {
      return new SMStyleCheesePizza();
    } else if (item.equals("potato")) {
      return new SMStylePotatoPizza();
    } else if (item.equals("pepperoni")) {
      return new SMStylePepperoniPizza();
    } else if (item.equals("veggie")) {
      return new SMStyleVeggiePizza(); 
    } else return null;
  }
}