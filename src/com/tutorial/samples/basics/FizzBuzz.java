package com.tutorial.samples.basics;

public class FizzBuzz {
    public static void main(String[] args) {
        fb(30, 3, 4);
//        fb2(5);
    }

    static void fb(int lim, int a, int b) {
        /*for*/
        for(int i = 1; i <= lim; i++) {
            /*if*/
            if(i % a == 0 && i % b == 0) {
                System.out.println("FizzBuzz");
            } else if (i % a == 0) {
                System.out.println("Fizz");
            } else if (i % b == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            /*endif*/
        }
        /*endfor*/
    }

    static void fb2(int lim) {
        for(int i = 1; i <= lim; i++) {
            switch (i) {
                case 1:
                    System.out.println(i);
                    break;
                case 3:
                    System.out.println(i);
                    break;
                case 5:
                    System.out.println(i);
                    break;
                default:
                    System.out.println(0);
                    break;
            }/*endswitch*/
        }/*endfor*/
    }

}
