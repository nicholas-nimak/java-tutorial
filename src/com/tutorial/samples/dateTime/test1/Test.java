package com.tutorial.samples.dateTime.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println(sdf.parse("1954-04-02"));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
