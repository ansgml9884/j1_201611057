package headfirst.designpatterns.observer.weather;

//Observer�� java library ��ü ����

public interface Observer{
  public void update(float temp, float humidity, float pressure);
}