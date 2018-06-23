package com.tutorial.samples.basics;

public class SortNumb {
    public static void main(String[] args) {
            createNumbs();
            showNumbs();
            sort();
            showNumbs();
    }
    private static byte[] numbs = new byte[8];
    static void showNumbs() {
        for (byte numb : numbs) {
            System.out.print(numb + " ");
        }
        System.out.print("\n");
    }
    static void createNumbs() {
        for (byte i = 0; i < numbs.length; i++) {
            numbs[i] = (byte) Math.rint(Math.random()*100);
        }
    }
    static void sort() {
        for (int i = 0; i < numbs.length; i++) {
            for (int j = i+1; j < numbs.length; j++) {
                if (numbs[j] < numbs[i]) {
                    byte tmp = numbs[i];
                    numbs[i] = numbs[j];
                    numbs[j] = tmp;
                }
            }
        }
    }
}
