package com.tutorial.samples.recursion.test1;

public class Test {
    private static int[] list = {1, 2, 3, 4, 5};
    public static void main(String[] args) {
        System.out.println("Hello world");
        print();
    }
    private static void print() {
        print(0);
    }
    private static void print(int i ) {
        if (i == list.length - 1) System.out.println(list[i]);
        else {
            System.out.println(list[i]);
            print(i + 1);
        }
    }
}
