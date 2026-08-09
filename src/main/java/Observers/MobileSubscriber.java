package Observers;

import Data.WeatherData;

public class MobileSubscriber implements WeatherSubscriber{
    @Override
    public void update(WeatherData data) {
        System.out.print("Mobile update----");
        System.out.print("Temperature-" + data.getTemperature());
        System.out.println(", Humidity-" + data.getHumidity() + "\n\n");
    }
}
