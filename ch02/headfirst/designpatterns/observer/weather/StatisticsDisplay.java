// -*- mode: java; coding: utf-8 -*-
// file: StatisticsDisplay.java
//     Created:       <2020/01/11 13:32:50>
//     Last Modified: <2020/01/12 00:08:54>

package headfirst.designpatterns.observer.weather;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = "
                           + (tempSum / numReadings)
                           + "/" + maxTemp
                           + "/" + minTemp);
    }
}
