package observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayWithAPI implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplayWithAPI(Observable weather) {
        this.observable = weather;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay{" +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherDataWithAPI) {
            WeatherDataWithAPI weatherData = (WeatherDataWithAPI) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
