package headfirst.designpatterns.factory.pizzafm;

public class PizzaTestDrive{
  public static void main(String[] args){
    PizzaStore nyStore = new NYPizzaStore();
    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a "+pizza.getName()+"\n");
    pizza = nyStore.orderPizza("clam");
    System.out.println("Joel ordered a "+pizza.getName()+"\n");
    
    PizzaStore smStore = new SMPizzaStore();
    Pizza pizza2= smStore.orderPizza("potato");
    System.out.println("Luna ordered a "+pizza2.getName()+"\n");
    pizza2 = smStore.orderPizza("veggie");
    System.out.println("Tom ordered a "+pizza2.getName()+"\n");
  }
}