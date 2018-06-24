package observer;

public class WeatherStation {
    public static void main(String[] args){
       // WeatherData weatherData = new WeatherData();
        WeatherDataWithAPI weatherData2 = new WeatherDataWithAPI();

       // CurrentConditionsDisplay currentDispaly = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplayWithAPI currentDispaly2 = new CurrentConditionsDisplayWithAPI(weatherData2);

        weatherData2.setMeasurements(80, 65, 30.4f);
        weatherData2.setMeasurements(82, 66, 20.4f);
        weatherData2.setMeasurements(70, 60, 40.4f);


        //currentDispaly.display();
    }
}
