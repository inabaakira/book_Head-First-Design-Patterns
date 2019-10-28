// -*- mode: java; coding: utf-8 -*-
// file: MiniDuckSimulator.java
//     Created:       <2019/09/19 10:48:50>
//     Last Modified: <2019/09/19 11:06:17>

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
