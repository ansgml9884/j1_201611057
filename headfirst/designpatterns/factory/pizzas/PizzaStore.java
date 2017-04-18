package headfirst.designpatterns.factory.pizzas;

public class PizzaStore{
  SimplePizzaFactory factory;
  public PizzaStore(SimplePizzaFactory factory){
    this.factory= factory;
  }
  public Pizza orderPizza(String type){
    Pizza pizza;
    pizza = factory.createPizza(type); // factory Ư¡
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    System.out.println(pizza.toString());
    return pizza;
  }

}