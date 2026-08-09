package Observable;

import Data.WeatherData;
import Observers.WeatherSubscriber;

public interface WeatherPublisher {
    public void add(WeatherSubscriber sub);

    public void remove(WeatherSubscriber sub);

    public void notiifyAll();

    public void setState(float temp, float humidty);
}
