package com.tutorial.samples.classes;

public class RectTest {
    public static void main(String[] args) {
        System.out.println(new Rect(10, 10, 20, 20));
        System.out.println(new Rect());
        System.out.println(new DrawableRect(10, 10, 20, 20));
        System.out.println(new ColoredRect(10, 10, 20, 20));
    }
}
