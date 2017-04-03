package headfirst.designpatterns.observer.weather;

//Observer도 java library 대체 가능

public interface Observer{
  public void update(float temp, float humidity, float pressure);
}