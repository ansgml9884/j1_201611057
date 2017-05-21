package headfirst.designpatterns.command.simpleremote;

public class SimpleRemoteControl {
  Command slot;
  public void setCommand(Command c){
    slot = c;
  }
  public void buttonWasPressed(){
    slot.execute();
  }
}