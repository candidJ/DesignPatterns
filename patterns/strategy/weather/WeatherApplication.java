package patterns.strategy.weather;

public class WeatherApplication {
     public static void main(String args[]){
          Weather weather = new MuktsarCityWeather();
          // first the forecast is set via city name
          weather.performForcast();
          // behavior is changed via setBehavior method
          weather.setForecastBehavior(new ForecastViaLatitudeAndLongitude());
          // new forecast via latitude and longitude is performed
          weather.performForcast();
     }
}
