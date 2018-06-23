package com.tutorial.samples.basics;

public class FactComputer {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("1");
            System.out.println(Factorial.recursive(i));
        }
        catch (NumberFormatException nfe) {
            System.out.println(nfe);
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae);
        }
    }
}
