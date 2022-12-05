package patterns.strategy.weather;

public class LatLongForecastStrategy implements ForecastStrategy {

    public String forecast() {
        System.out.println("Forecast via lat and long");
        return "Forecast is sunny and temperature is 25 degree Celsius";
    }
}
