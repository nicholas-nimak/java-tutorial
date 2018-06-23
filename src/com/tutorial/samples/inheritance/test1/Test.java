package com.tutorial.samples.inheritance.test1;

public class Test {
    public static void main(String[] args) {
        new Child();
    }
}

class Parent {
    Parent(int i) {
        System.out.println("Parent(); " + i);
    }
}
class Child extends Parent {
    Child() {
        super(1);
        System.out.println("Child();");
    }
}
