package patterns.strategy.weather;

public class ForecastViaLatitudeAndLongitude implements ForecastInterface {

    public String forecast() {
        System.out.println("Forecast via la and long");
        return "Weather is 25 degree celcius";
    }
}
