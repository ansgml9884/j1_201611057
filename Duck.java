package headfirst.designpatterns.strategy;
  
public abstract class Duck{
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
  
    public Duck(){}
    
    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior = qb;
    }
    
    abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
        System.out.println("All ducks fly...!");
    }
    
    public void performQuack(){
        quackBehavior.quack();
        System.out.println("All ducks quack...!");
    }
    
    public void swim(){
        System.out.println("All ducks float, even decoys!");

    }
}