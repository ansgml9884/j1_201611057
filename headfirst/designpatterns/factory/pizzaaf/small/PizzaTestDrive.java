package headfirst.designpatterns.factory.pizzaaf.small;

public class PizzaTestDrive {
 
 public static void main(String[] args) {
  PizzaStore nyStore = new NYPizzaStore();
  PizzaStore chicagoStore = new ChicagoPizzaStore();
 
  Pizza pizza = nyStore.orderPizza("cheese");
  System.out.println("Ethan ordered a " + pizza + "\n");
 
  pizza = chicagoStore.orderPizza("pepperoni");
  System.out.println("Joel ordered a " + pizza + "\n");

  pizza = chicagoStore.orderPizza("veggie");
  System.out.println("Luna ordered a " + pizza + "\n");
 }
}