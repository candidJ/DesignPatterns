package patterns.strategy.weather;

public class MuktsarCityForecast extends ForecastContext {

    public MuktsarCityForecast() {
        this.forecastInterface = new CityNameForecastStrategy();
    }

}
