// -*- mode: java; coding: utf-8 -*-
// file: MallardDuck.java
//     Created:       <2019/09/19 10:43:19>
//     Last Modified: <2019/09/19 10:45:13>

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}
