package patterns.observer;

public class UserInterfaceObserver implements Observer {

	WeatherStationPublisher weatherStation;

	public UserInterfaceObserver(WeatherStationPublisher weatherStation) {
		this.weatherStation = weatherStation;
		this.weatherStation.registerObserver(this);
	}

	private void display() {
		System.out.println("displaying the user interface...");
	}

	@Override
	public void alert(double temperature, double windSpeed, String pressure) {
		display();
		System.out.println(
				"User interface is: " + " temp- " + temperature + " wind speed- " + windSpeed + " pressure- " + pressure);

	}

}
