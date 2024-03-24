package patterns.observer;

import java.util.ArrayList;

public class WeatherStationPublisher {

	private double temperature;
	private double windSpeed;
	private String pressure;

	private ArrayList<Observer> observers = new ArrayList<Observer>();

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		int observerIndex = observers.indexOf(observer);
		if (observerIndex > 0) {
			observers.remove(observerIndex);
		}
	}

	private void notifyObservers() {
		System.out.println("Notifying registered Observers...");
		for (Observer observer : observers) {
			observer.alert(temperature, windSpeed, pressure);
		}
	}

	public void setMeasurements(double temperature, double windSpeed, String pressure) {
		this.pressure = pressure;
		this.temperature = temperature;
		this.windSpeed = windSpeed;
		notifyObservers();
	}

}
