package patterns.observer;

public class AlertSystemObserver implements Observer {

	WeatherStationPublisher weatherStation;

	public AlertSystemObserver(WeatherStationPublisher weatherStation) {
		this.weatherStation = weatherStation;
		// observer with register for future updates
		this.weatherStation.registerObserver(this);
	}

	@Override
	public void alert(double temperature, double windSpeed, String pressure) {
		if (pressure == "HIGH") {
			System.out.println("Alert for high pressure");
		} else {
			System.out.println("Pressure is normal");
		}
	}

}
