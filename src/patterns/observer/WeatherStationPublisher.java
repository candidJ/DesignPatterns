package patterns.observer;

import java.util.ArrayList;

public class WeatherStationPublisher implements WeatherStation<Observer> {

	private double temperature;
	private double windSpeed;
	private String pressure;

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

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
