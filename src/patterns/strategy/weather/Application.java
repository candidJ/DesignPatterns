package patterns.strategy.weather;
public class Application {
    public static void main(String args[]) {
        ForecastContext forecastContext = new ForecastContext();
        // behavior is changed via setBehavior method
        forecastContext.setForecastStrategy(new LatLongForecastStrategy());
        // new forecast via latitude and longitude is performed
        forecastContext.forecast();
    }
}
