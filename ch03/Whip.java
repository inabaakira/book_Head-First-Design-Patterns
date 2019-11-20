// -*- mode: java; coding: utf-8 -*-
// file: Whip.java
//     Created:       <2019/11/18 12:56:10>
//     Last Modified: <2019/11/18 12:58:14>

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + .10;
    }
}
