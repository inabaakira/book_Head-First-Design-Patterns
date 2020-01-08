// -*- mode: java; coding: utf-8 -*-
// file: Subject.java
//     Created:       <2020/01/08 16:56:59>
//     Last Modified: <2020/01/09 10:00:44>

package headfirst.designpatterns.observer.weather;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
