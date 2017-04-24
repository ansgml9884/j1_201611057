package headfirst.designpatterns.factory.pizzafm;

public class NYStyleClamPizza extends Pizza{
  
  public NYStyleClamPizza(){
    name = "NY Style Clam Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";
    
    toppings.add("Greated Reggiano cheese");
    toppings.add("Fresh Clams from Long Island Sound");
  }
}