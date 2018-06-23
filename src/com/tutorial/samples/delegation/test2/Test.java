package com.tutorial.samples.delegation.test2;

public class Test {
    public static void main(String[] args) {
        new Human("Elizabeth").talk();
    }
}

class Mouse {
    void talk(String sentence) {
        System.out.println(sentence);
    }
}

class Human {
    private String name;
    Human(String name) {
        this.name = name;
    }
    void talk() {
        new Mouse().talk("My name is " + name);
    }
}