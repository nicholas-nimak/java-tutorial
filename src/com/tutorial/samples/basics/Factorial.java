package com.tutorial.samples.basics;

public class Factorial {
    public static void main(String [] args) {
        System.out.println(decrement(4));
        System.out.println(increment(5));
        System.out.println(recursive(6));
        System.out.println(cashing(6));
    }

    private static int decrement(int x) {
        int f = x;
        while (x > 1) {
            f *= --x;
        }
        return f;
    }

    private static int increment(int x) {
        int f = 1, i = 2;
        while (i <= x) {
            f *= i++;
        }
        return f;
    }

    static int recursive(int x) {
        if (x < 0) throw new IllegalArgumentException("Argument should not be negative");
        if (x < 2) {
            return 1;
        }
        return x * recursive(x-1);
    }

    private static int[] factorials = new int[7];
    static { factorials[0] = 1; }

    private static int cashing(int x ) {
        if (x >= factorials.length) throw new IllegalArgumentException("Аргумент должен быть меньше 7");
        if (x < 0) throw new IllegalArgumentException("Аргумент должен быть не меньше 0");
        int last = 0;
        while (last < x) {
            factorials[last + 1] = factorials[last] * (last + 1);
            last++;
        }
        return factorials[x];
    }

}
