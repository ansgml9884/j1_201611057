package headfirst.designpatterns.factory.pizzaaf.small;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory 
{

 public Dough createDough() {
  return new ThickCrustDough();
 }

 public Sauce createSauce() {
  return new PlumTomatoSauce();
 }

 public Cheese createCheese() {
  return new MozzarellaCheese();
 }
 
 public Potato createPotato() {
  return new MashedPotato();
 }
 
 public Veggies[] createVeggies() {
  Veggies veggies[] = { new BlackOlives(), 
                        new Spinach(),};
  return veggies;
 }

 public Pepperoni createPepperoni() {
  return new SlicedPepperoni();
 }
}