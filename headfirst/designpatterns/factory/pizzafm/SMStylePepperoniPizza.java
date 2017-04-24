package headfirst.designpatterns.factory.pizzafm;

public class SMStylePepperoniPizza extends Pizza{
  
  public SMStylePepperoniPizza(){
    name = "SM style pepperoni pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";
    
    toppings.add("Grated Reggiano cheese");
    toppings.add("Garlic");
    toppings.add("Onion");
    toppings.add("Mushrooms");
    toppings.add("Red Pepper");
  }
}