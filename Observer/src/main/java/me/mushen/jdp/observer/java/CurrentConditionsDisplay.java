package me.mushen.jdp.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * @Desc
 * @Author Remilia
 * @Create 2018-03-06
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private double temperature;
    private double humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }
}
