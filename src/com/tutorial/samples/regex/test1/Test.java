package com.tutorial.samples.regex.test1;

import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        boolean b = Pattern.matches("(.*)(\\d+)(.*)", "This order was placed for QT3000! OK?");
        System.out.println(b);
    }
}
