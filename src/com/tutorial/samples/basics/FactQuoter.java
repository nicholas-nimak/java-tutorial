package com.tutorial.samples.basics;

public class FactQuoter {
    static int i = 0;
    public static void main(String[] args) throws Exception {
        for (;;) {
            try {
                i++;
                if (i > 10) break;
                System.out.println(Factorial.recursive(5));
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
