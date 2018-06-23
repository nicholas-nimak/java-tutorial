package com.tutorial.samples.basics;
import com.tutorial.samples.classes.Polygon;

public class Octagon extends Polygon {
    public static void main(String[] args) {
        Octagon o = new Octagon();
        System.out.println(o);
    }
    private Octagon() {
        angles = 8;
    }
}
