package patterns.observer.weatherStation;

public class WeatherStationApplication {

	public static void main(String[] args) {
		WeatherStationPublisher weatherStationPublisher = new WeatherStationPublisher();
		// Initialize the observers
		Observer logger = new LoggerObserver(weatherStationPublisher);
		Observer alert = new AlertSystemObserver(weatherStationPublisher);
		Observer ui = new UserInterfaceObserver(weatherStationPublisher);
		// alternative way to register to receive update notifications
		// weatherStationPublisher.registerObserver(ui);
		weatherStationPublisher.registerObserver(logger);
		// weatherStationPublisher.registerObserver(alert);
		// Initialize the weather station to set of values
		weatherStationPublisher.setMeasurements(90, 112.2, "HIGH");
		weatherStationPublisher.setMeasurements(99, 78, "LOW");
	}

}
