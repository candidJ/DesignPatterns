package patterns.strategy.weather;

/**
 * Forecast Context class contains the Forecast Strategy Interface
 */

public class ForecastContext {

    ForecastStrategy forecastStrategy;

    String forecast() {
        return getForecastStrategy().forecast();
    }

    // client to set the behavior at run time by calling this method
    void setForecastStrategy(ForecastStrategy forecastStrategy) {
        this.forecastStrategy = forecastStrategy;
    }

    ForecastStrategy getForecastStrategy() {
        return forecastStrategy;
    }

}
