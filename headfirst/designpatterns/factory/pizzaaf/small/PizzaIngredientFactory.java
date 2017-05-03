package headfirst.designpatterns.factory.pizzaaf.small;

public interface PizzaIngredientFactory {
 
 public Dough createDough();
 public Sauce createSauce();
 public Cheese createCheese();
 public Veggies[] createVeggies();
 public Pepperoni createPepperoni();
}