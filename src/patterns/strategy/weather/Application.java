package patterns.strategy.weather;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String args[]) {
        ForecastContext forecastContext = new MuktsarCityForecast();
        // Initially the forecast is set via city name on initialization of Muktsar city forecast class
        forecastContext.forecast();
        // behavior is changed via setBehavior method
        forecastContext.setForecastStrategy(new LatLongForecastStrategy());
        // new forecast via latitude and longitude is performed
        forecastContext.forecast();
    }
}
