package patterns.observer.weatherStation;

public interface Observer {

	void alert(double temperature, double windSpeed, String pressure);
}
