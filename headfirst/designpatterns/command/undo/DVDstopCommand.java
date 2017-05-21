package headfirst.designpatterns.command.undo;

public class DVDstopCommand implements Command {
  DVD dvd;

 public DVDstopCommand(DVD dvd) {
  this.dvd = dvd;
 }

 public void execute() {
  dvd.stop();
 }
 public void undo(){}
}