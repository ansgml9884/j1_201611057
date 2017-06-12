package headfirst.designpatterns.state.gumball;

public class GumballMachine{
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State state = soldOutState;
  int count = 0;
  public GumballMachine(int num){
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    this.count = num;
    if(num>0){
      state = noQuarterState;
    }
  }
  public void insertQuarter(){
    state.insertQuarter();
  }
  public void ejectQuarter(){
    state.ejectQuarter();
  }
  public void turnCrank(){
    state.turnCrank();
    state.dispense();
  }
  int getCount() {
    return count;
  }
 
  public void setState(State s){
    this.state = s;
  }
  public State getState(){
    return state;
  }
  public State getNoQuarterState(){
    return noQuarterState;
  }
  public State getHasQuarterState(){
    return hasQuarterState;
  }
  public State getSoldOutState(){
    return soldOutState;
  }
  public State getSoldState(){
    return soldState;
  }
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("\nMighty Gumball, Inc.");
    result.append("\nJava-enabled Standing Gumball Model #2004");
    result.append("\nInventory: " + count + " gumball");
    if (count != 1) {
      result.append("s");
    }
    result.append("\n");
    result.append("Machine is " + state + "\n");
    return result.toString();
  }
}