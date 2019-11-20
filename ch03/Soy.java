// -*- mode: java; coding: utf-8 -*-
// file: Soy.java
//     Created:       <2019/11/18 12:46:36>
//     Last Modified: <2019/11/20 11:18:19>

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        if ( beverage.getSize() == Beverage.Size.TALL ) {
            return beverage.cost() + .10;
        }
        else if ( beverage.getSize() == Beverage.Size.GRANDE ) {
            return beverage.cost() + .15;
        }
        else if ( beverage.getSize() == Beverage.Size.VENTI ) {
            return beverage.cost() + .20;
        }
        return beverage.cost() + .10;
    }
}
