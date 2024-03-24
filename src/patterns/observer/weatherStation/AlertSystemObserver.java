package patterns.observer.weatherStation;

public class AlertSystemObserver implements Observer {

	WeatherStationPublisher weatherStation;

	public AlertSystemObserver(WeatherStationPublisher weatherStation) {
		this.weatherStation = weatherStation;
		// observer with register for future updates
		this.weatherStation.registerObserver(this);
	}

	private void log() {
		System.out.println("Alert Observer...");
	}

	@Override
	public void alert(double temperature, double windSpeed, String pressure) {
		log();
		if (pressure == "HIGH") {
			System.out.println("Alert for high pressure");
		} else {
			System.out.println("Pressure is normal");
		}
	}

}
