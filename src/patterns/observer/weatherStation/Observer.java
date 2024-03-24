package patterns.observer.weatherStation;

public interface Observer {

	public void alert(double temperature, double windSpeed, String pressure);
}
