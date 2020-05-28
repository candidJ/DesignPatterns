package patterns.observer.lab1;

public class Application {

	public static void main(String[] args) {
		WeatherStationPublisher weatherStation = new WeatherStationPublisher();
		// Initialize the observers
		Observer logger = new LoggerObserver(weatherStation);
		Observer alert = new AlertSystemObserver(weatherStation);
		Observer ui = new UserInterfaceObserver(weatherStation);
//		weatherStation.setPressure("HIGH");
//		weatherStation.setTemperature(11.33);
//		weatherStation.setWindSpeed(90);

//		weatherStation.registerObserver(new UserInterfaceObserver());
//		weatherStation.registerObserver(new LoggerObserver());

		// Initialize the weathe station to set of values
		weatherStation.setMeasurements(90, 112.2, "HIGH");
		weatherStation.setMeasurements(99, 78, "LOW");
//		checkWeatherAttributes(weatherStation);
	}

	private static void checkWeatherAttributes(WeatherStationPublisher weatherStation) {

		if (weatherStation.getPressure() == "HIGH") {
			System.out.println("checking weather attributes..." + weatherStation.getPressure());
			weatherStation.notifyObservers();
		}
	}

}
