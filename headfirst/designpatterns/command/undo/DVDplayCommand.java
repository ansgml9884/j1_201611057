package headfirst.designpatterns.command.undo;

public class DVDplayCommand implements Command {
  DVD dvd;

 public DVDplayCommand(DVD dvd) {
  this.dvd = dvd;
 }

 public void execute() {
  dvd.play();
 }
 public void undo(){}
 
}