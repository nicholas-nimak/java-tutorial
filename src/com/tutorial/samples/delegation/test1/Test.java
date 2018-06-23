package com.tutorial.samples.delegation.test1;

public class Test {
    public static void main(String[] args) {
        Human nicholas = new Human("Nicholas");
        nicholas.talk();
    }
}

class Mouse {
    void talk(String sentence) {
        System.out.println(sentence);
    }
}

class Human extends Mouse {
    private String name;
    Human(String name) {
        this.name = name;
    }
    void talk() {
        super.talk("My name is " + name);
    }
}
