package patterns.strategy.weather;

public class CityNameForecastStrategy implements ForecastStrategy {

    public String forecast() {
        System.out.println("Forecast via City name");
        return "Forecast is cloudy and temperature is 10 degree Celsius";
    }
}
