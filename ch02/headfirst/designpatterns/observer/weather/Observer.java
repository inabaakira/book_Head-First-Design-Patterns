// -*- mode: java; coding: utf-8 -*-
// file: Observer.java
//     Created:       <2020/01/08 17:29:31>
//     Last Modified: <2020/01/09 09:56:45>

package headfirst.designpatterns.observer.weather;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
