package com.tutorial.samples.regex.test3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".*ds.+");
        Matcher m = p.matcher("Hidsaff");
        System.out.println(m.matches());
    }
}
