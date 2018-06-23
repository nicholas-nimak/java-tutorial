package com.tutorial.samples.delegation.test4;

public class Test {
    public static void main(String[] args) {
        Human a = new Human("Avrora");
        a.talk();
    }
}

class Mouse {
    void talk(String s) {
        System.out.println(s);
    }
}

class Human {
    private String name;
    private Mouse mouse = new Mouse();
    void talk() {
        mouse.talk("My name is " + name);
    }
    Human(String name) {
        this.name = name;
    }
}