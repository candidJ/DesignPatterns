package patterns.strategy.weather;

public class Weather {

    ForecastInterface forecastInterface;

    String performForcast() {
        return this.forecastInterface.forecast();
    }

    void setForecastBehavior(ForecastInterface forecastInterface) {
        this.forecastInterface = forecastInterface;
    }

}
