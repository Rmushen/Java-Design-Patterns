package me.mushen.jdp.observer.java;

import java.util.Observable;

/**
 * @Desc
 * @Author Remilia
 * @Create 2018-03-06
 */
public class WeatherData extends Observable {
    private double temperature;
    private double humidity;
    private double pressure;

    public void measurementsChanged() {
        setChanged();
        notifyObservers(); // notifyObservers(Object arg)
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
