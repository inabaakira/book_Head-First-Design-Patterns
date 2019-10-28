// -*- mode: java; coding: utf-8 -*-
// file: MuteQuack.java
//     Created:       <2019/09/19 10:39:55>
//     Last Modified: <2019/09/19 10:40:31>

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
