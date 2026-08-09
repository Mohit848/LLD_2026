package Observable;

import Data.WeatherData;
import Observers.WeatherSubscriber;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherPublisher{
    private List<WeatherSubscriber> subscrbers;
    private WeatherData weatherData;

    public WeatherStation(){
        this.subscrbers = new ArrayList<>();
    }


    @Override
    public void add(WeatherSubscriber sub) {
        subscrbers.add(sub);
        System.out.println("Subscriber added");
    }

    @Override
    public void remove(WeatherSubscriber sub) {
        subscrbers.remove(sub);
        System.out.println("Subscriber removed");
    }

    @Override
    public void notiifyAll() {
        for(WeatherSubscriber sub : subscrbers){
            sub.update(this.weatherData);
        }
        System.out.println("Notification sent to all\n\n");
    }

    @Override
    public void setState(float temp, float humidity) {
        this.weatherData = new WeatherData();
        this.weatherData.setTemperature(temp);
        this.weatherData.setHumidity(humidity);
        System.out.println("Weather data changed");
        notiifyAll();
    }
}
