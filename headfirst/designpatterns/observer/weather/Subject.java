package headfirst.designpatterns.observer.weather;

//subject ��� java library Observable ��밡�� 

public interface Subject {
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}