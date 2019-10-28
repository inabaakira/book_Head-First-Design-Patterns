// -*- mode: java; coding: utf-8 -*-
// file: ModelDuck.java
//     Created:       <2019/09/19 10:58:43>
//     Last Modified: <2019/09/19 11:02:10>

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
