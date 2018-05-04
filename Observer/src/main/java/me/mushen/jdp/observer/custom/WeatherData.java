package me.mushen.jdp.observer.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc
 * @Author Remilia
 * @Create 2018-03-05
 */
public class WeatherData implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    private double temperature;
    private double humidity;
    private double pressure;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if(index >= 0) {
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
