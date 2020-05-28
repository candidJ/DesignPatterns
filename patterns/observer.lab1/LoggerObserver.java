package patterns.observer.lab1;

public class LoggerObserver implements Observer {

	WeatherStationPublisher weatherStation;

	public LoggerObserver(WeatherStationPublisher weatherStation) {
		this.weatherStation = weatherStation;
		this.weatherStation.registerObserver(this);
	}


	private void log() {
		System.out.println("displaying logs...");
	}


	@Override
	public void alert(double temperature, double windSpeed, String pressure) {
		log();
		System.out.println(
				"Logs: " + "temp- " + temperature + " wind speed- " + windSpeed + " pressure- " + pressure);
		
	}

}
