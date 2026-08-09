package Observers;

import Data.WeatherData;

public class TVSubscriber implements WeatherSubscriber{
    @Override
    public void update(WeatherData data) {
        System.out.print("TV update----");
        System.out.print("Temperature-" + data.getTemperature());
        System.out.println(", Humidity-" + data.getHumidity() + "\n\n");
    }
}
