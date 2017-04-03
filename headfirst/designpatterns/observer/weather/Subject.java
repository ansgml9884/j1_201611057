package headfirst.designpatterns.observer.weather;

//subject 대신 java library Observable 사용가능 

public interface Subject {
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}