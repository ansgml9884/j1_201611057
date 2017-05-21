package headfirst.designpatterns.command.undo;

public class RemoteLoader {
 
 public static void main(String[] args) {
  RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
  Light light = new Light();  
  DVD dvd = new DVD();
  
  LightOnCommand LightOn = new LightOnCommand(light);
  LightOffCommand LightOff = new LightOffCommand(light);

  DVDplayCommand DVDplay = new DVDplayCommand(dvd);
  DVDstopCommand DVDstop = new DVDstopCommand(dvd);
  
  remoteControl.setCommand(0, LightOn, LightOff);
  remoteControl.setCommand(1, DVDplay, DVDstop);
  System.out.println(remoteControl);
  
  remoteControl.onButtonWasPushed(0);
  remoteControl.offButtonWasPushed(0);
  remoteControl.onButtonWasPushed(1);
  remoteControl.offButtonWasPushed(1);
  
 }
}