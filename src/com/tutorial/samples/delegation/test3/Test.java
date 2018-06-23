package com.tutorial.samples.delegation.test3;

public class Test {
    public static void main(String[] args) {
        Human naomi = new Human("Naomi");
        naomi.mouse.talk("My name is " + naomi.name);
    }
}

class Mouse {
    void talk(String s) {
        System.out.println(s);
    }
}

class Human {
    String name;
    Mouse mouse = new Mouse();
    Human(String name) {
        this.name = name;
    }
}