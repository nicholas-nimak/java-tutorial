package com.tutorial.samples.io.file.test7;

public class Test {
    public static void main(String[] args) {
        System.out.println(recursive(0));
    }
    private static int recursive(int a) {
        if (a > 5) {
            return a;
        } else {
            return recursive(a + 1);
        }
    }
}
