// -*- mode: java; coding: utf-8 -*-
// file: CurrentConditionsDisplay.java
//     Created:       <2020/01/10 11:44:32>
//     Last Modified: <2020/01/10 14:47:15>

package headfirst.designpatterns.observer.weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                           + "F degrees and " + humidity + "% humidity");
    }
}
