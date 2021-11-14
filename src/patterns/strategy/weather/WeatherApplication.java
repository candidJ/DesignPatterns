package patterns.strategy.weather;

import java.util.HashMap;
import java.util.Map;

public class WeatherApplication {
    public static void main(String args[]) {
        Weather weather = new MuktsarCityWeather();
        // first the forecast is set via city name
        weather.performForcast();
        // behavior is changed via setBehavior method
        weather.setForecastBehavior(new ForecastViaLatitudeAndLongitude());
        // new forecast via latitude and longitude is performed
        weather.performForcast();

        String hello = "hello";
        System.out.println("The hash code of hello is " + hello.hashCode());

        Map<String, String> myHashMap = new HashMap();
        myHashMap.put("name", "Jaskirat");
        String myName = myHashMap.get("name");
        System.out.println("the value of name is " + myName);
    }
}
