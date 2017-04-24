package headfirst.designpatterns.factory.pizzafm;

public class SMStyleCheesePizza extends Pizza {

 public SMStyleCheesePizza() { 
  name = "SM Style Sauce and Cheese Pizza";
  dough = "Thin Crust Dough";
  sauce = "Marinara Sauce";
 
  toppings.add("Grated Reggiano Cheese");
 }
}