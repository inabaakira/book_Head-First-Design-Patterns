// -*- mode: java; coding: utf-8 -*-
// file: Mocha.java
//     Created:       <2019/11/18 12:05:31>
//     Last Modified: <2019/11/18 12:58:52>

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + .20;
    }
}
