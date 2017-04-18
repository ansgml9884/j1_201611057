package headfirst.designpatterns.factory.pizzas;

public class SimplePizzaFactory{
  public Pizza createPizza(String type){
     Pizza pizza = null;
    if(type.equals("cheese")){
      //(type == "cheese") - error(reference �θ�)
      pizza = new CheesePizza();
    } else if(type.equals("pepperoni")){
      pizza = new PepperoniPizza();
    } else if(type.equals("potato")){
      pizza = new PotatoPizza();
    }
    return pizza;
  }
}