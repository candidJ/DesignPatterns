package patterns.observer.lab1;

public interface WeatherStation<T> {

	public void registerObserver(T observer);

	public void removeObserver(T observer);

	public void notifyObservers();
}
