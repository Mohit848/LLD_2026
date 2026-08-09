package org.example;

import Observable.WeatherStation;
import Observers.MobileSubscriber;
import Observers.TVSubscriber;

public class Main {
    public static void main(String[] args) {
        // Push Model. Publisher pushes the all data to the subscribers
        WeatherStation station1 = new WeatherStation();
        MobileSubscriber mobileSubscriber1 = new MobileSubscriber();
        station1.add(mobileSubscriber1);
        station1.setState(20, 2);
        TVSubscriber tvSubscriber1 = new TVSubscriber();
        station1.add(tvSubscriber1);
        station1.setState(22, 1);


        //Pull model Publisher only notifies, Subscribers has reference to Publisher object
        // and get the data they need. To be implemented below.

    }
}