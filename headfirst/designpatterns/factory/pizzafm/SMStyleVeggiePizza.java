package headfirst.designpatterns.factory.pizzafm;

public class SMStyleVeggiePizza extends Pizza{
  
  public SMStyleVeggiePizza(){
    name = "SM Style Veggie Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";
   
    toppings.add("Grated Reggiano cheese");
    toppings.add("Garlic");
    toppings.add("Onion");
    toppings.add("Mushrooms");
    toppings.add("Red Pepper");
  }
}