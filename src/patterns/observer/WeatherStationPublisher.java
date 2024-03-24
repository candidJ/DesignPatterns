package patterns.observer;

import java.util.ArrayList;

public class WeatherStationPublisher implements WeatherStation<Observer> {

	private double temperature;
	private double windSpeed;
	private String pressure;

	private ArrayList<Observer> observers = new ArrayList<Observer>();

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int observerIndex = observers.indexOf(observer);
		if (observerIndex > 0) {
			observers.remove(observerIndex);
		}
	}

	@Override
	public void notifyObservers() {
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
