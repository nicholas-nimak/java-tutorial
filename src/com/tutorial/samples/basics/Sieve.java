package com.tutorial.samples.basics;

public class Sieve {
    public static void main(String[] args) {
        int max = 30;

        boolean[] isprime = new boolean[max + 1];
        for (int i = 0; i < isprime.length; i++) isprime[i] = true;
        isprime[0] = isprime[1] = false;

        for (int p = 0; p < isprime.length; p++) {
            if (isprime[p]) {
                for (int i = p*p; i < isprime.length; i+=p) {
                    isprime[i] = false;
                }
            }
        }

        for (int i = 0; i < isprime.length; i++) {
            if (isprime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
