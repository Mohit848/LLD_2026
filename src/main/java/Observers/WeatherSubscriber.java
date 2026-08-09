package Observers;

import Data.WeatherData;

public interface WeatherSubscriber {
    void update(WeatherData data);
}
