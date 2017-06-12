package headfirst.designpatterns.state.gumball;

public class SoldState implements State {
    GumballMachine gm;
    public SoldState(GumballMachine gm){
      this.gm = gm;
    }
    public void insertQuarter() {
      System.out.println("Please wait, we're already giving you a gumball");
    }
 
    public void ejectQuarter() {
      System.out.println("Sorry, you already turned the crank");
    }
 
    public void turnCrank() {
      System.out.println("Turning twice doesn't get you another gumball!");
    }
 
    public void dispense() {
      if (gm.getCount() > 0) {
        gm.setState(gm.getNoQuarterState());
      } else {
        System.out.println("Oops, out of gumballs!");
        gm.setState(gm.getSoldOutState());
      }
    }
     
    public String toString() {
      return "dispensing a gumball";
    }
}
 