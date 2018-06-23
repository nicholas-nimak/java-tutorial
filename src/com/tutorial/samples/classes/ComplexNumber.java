package com.tutorial.samples.classes;

public class ComplexNumber {
    public static void main(String[] args) {
        ComplexNumber cn = new ComplexNumber(1.2, 2.3);
        cn.a = 4.3;
        System.out.println(cn);
    }
    private double a, b;
    private ComplexNumber(double real, double imaginary) {
        this.a = real;
        b = imaginary;
    }
    public String toString() {
        return "[" + a + ", " + b + "]";
    }
}
