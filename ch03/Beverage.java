// -*- mode: java; coding: utf-8 -*-
// file: Beverage.java
//     Created:       <2019/10/28 12:33:01>
//     Last Modified: <2019/11/20 10:18:33>

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}
