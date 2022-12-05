package patterns.strategy.weather;

public class ForecastContext {

    ForecastStrategy forecastStrategy;

    String forecast() {
        return this.forecastStrategy.forecast();
    }

    // client to set the behavior at run time by calling this method
    void setForecastStrategy(ForecastStrategy forecastStrategy) {
        this.forecastStrategy = forecastStrategy;
    }

    ForecastStrategy getForecastStrategy() {
        return forecastStrategy;
    }

}
