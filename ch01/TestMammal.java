// -*- mode: java; coding: utf-8 -*-
// file: TestMammal.java
//     Created:       <2019/10/18 13:54:28>
//     Last Modified: <2019/10/21 10:54:59>

class Mammal {
    public void eat () { System.out.println("I am eating."); };
}

interface IWalkable {
    public void walk();
}

class Dog extends Mammal implements IWalkable {
    IWalkable walker;
    public void setWalker () {
        this.walker = walker;
    }
    public void walk () { System.out.println("I am walking"); };
}

public class TestMammal {
    public static void main(String args[]) {
        System.out.println("Composition over Inheritance");
        System.out.println("\nDog");
        Dog fido = new Dog();
        fido.setWalker();
        fido.eat();
        fido.walk();
    }
}
