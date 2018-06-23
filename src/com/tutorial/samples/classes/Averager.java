package com.tutorial.samples.classes;

public class Averager {
    public static void main(String[] args) {
        Averager a = new Averager();
        System.out.println(a);
        a.addDatum(1.2);
        System.out.println(a);
        a.addDatum(1.8);
        System.out.println(a);
        System.out.println(a.getAverage());
        System.out.println(a.getStandartDeviation());
        a.reset();
        System.out.println(a);
    }
    private int n = 0;
    private double sum = 0.0, sumOfSquares = 0.0;
    private void addDatum(double x) {
        n++;
        sum += x;
        sumOfSquares += x * x;
    }
    private String getAverage() {
        return "average is " + sum / n;
    }
    private String getStandartDeviation() {
        return "standart deviation is " + Math.sqrt( (sumOfSquares - sum * sum / n) / n );
    }
    private void reset() {
        n = 0;
        sum = 0;
        sumOfSquares = 0;
    }

    @Override
    public String toString() {
        return "n = " + n + " " + "sum = " + sum + " " + "sumOfSquares = " + sumOfSquares;
    }
}
