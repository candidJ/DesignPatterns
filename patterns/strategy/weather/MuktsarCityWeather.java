package patterns.strategy.weather;

public class MuktsarCityWeather extends Weather{

    public MuktsarCityWeather(){
        this.forecastInterface = new ForecastViaCityName();
    }
    public void Display(){
        System.out.println("Muktsar city weather");
    }
}
