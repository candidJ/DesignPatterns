package patterns.strategy.weather;

public class ForecastViaCityName implements ForecastInterface {

    public String forecast() {
        System.out.println("Forecast via City name");
        return "Weather for Aukland is 10 degree celcius";
    }
}
