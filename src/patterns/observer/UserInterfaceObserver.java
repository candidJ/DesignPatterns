package patterns.observer;

public class UserInterfaceObserver implements Observer {

    WeatherStationPublisher weatherStation;

    public UserInterfaceObserver(WeatherStationPublisher weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    private void display() {
        System.out.println("User Interface...");
    }

    @Override
    public void alert(double temperature, double windSpeed, String pressure) {
        display();
        System.out.println(
                " Temperature: " + temperature + "\n Wind Speed: " + windSpeed + "\n Pressure: " + pressure);

    }

}
