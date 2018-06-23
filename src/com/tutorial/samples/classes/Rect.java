package com.tutorial.samples.classes;

public class Rect {
    private int A, B, C, D;
    Rect(int A, int B, int C, int D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }
    Rect() { this(0,0,0,0); }
    public String toString() {
        return "[" + A + "," + B + "," + C + "," + D + "]";
    }
}
