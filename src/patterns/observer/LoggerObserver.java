package patterns.observer;

public class LoggerObserver implements Observer {

    WeatherStationPublisher weatherStation;

    public LoggerObserver(WeatherStationPublisher weatherStation) {
        this.weatherStation = weatherStation;
        // registered in ObserverMainApplication Class
        // this.weatherStation.registerObserver(this);
    }

    private void log() {
        System.out.println("Logger Observer...");
    }

    @Override
    public void alert(double temperature, double windSpeed, String pressure) {
        log();
        System.out.println(
                " Temperature: " + temperature + "\n Wind Speed: " + windSpeed + "\n Pressure: " + pressure);
    }

}
