package observer;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherDataWithAPI extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataWithAPI() {

    }



    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }
    public float getHumidity(){
        return humidity;
    }
    public float getPressure(){
        return pressure;
    }
}
