package headfirst.designpatterns.factory.pizzafm;

public class SMStylePotatoPizza extends Pizza{
  
  public SMStylePotatoPizza(){
    name = "SM style Potato Pizza";
    dough = "Regular Crust Dough";
    sauce = "Marinara Sauce";
    
    toppings.add("Sliced Potato");
    toppings.add("Garlic");
    toppings.add("Onion");
    toppings.add("Parmesan");
  }
}