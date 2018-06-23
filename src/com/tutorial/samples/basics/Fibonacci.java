package com.tutorial.samples.basics;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci.f2(10));
        System.out.println(Fibonacci.f3(10));
        }

    static int f2(int lim) {
        int n3 = 1;
        for (int n1, n2 = 0, i = 1; i <= lim; i++) {
//            System.out.println(n3);
            if (i < lim) {
                n1 = n2;
                n2 = n3;
                n3 = n1 + n2;
            }
        }
        return n3;
    }

    static int f3(int lim) {
        int n4 = 1;
        for (int n1, n2 = 0, n3 = 0, i = 1; i <= lim; i++) {
//            System.out.println(n4);
            if (i < lim) {
                n1 = n2;
                n2 = n3;
                n3 = n4;
                n4 = n1 + n2 + n3;
            }
        }
        return n4;
    }

}

