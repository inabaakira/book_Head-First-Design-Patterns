// -*- mode: java; coding: utf-8 -*-
// file: Beverage.java
//     Created:       <2019/10/28 12:33:01>
//     Last Modified: <2019/11/04 17:10:14>

public abstract class Beverage {
    String descroption = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
