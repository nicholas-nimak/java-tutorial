package com.tutorial.samples.dateTime.test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(sdf.format(date));
        try {
            System.out.println(sdf.parse("12-05-2018"));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, 30);
        calendar.add(Calendar.DATE, 7);
        System.out.println(sdf.format(calendar.getTime()));
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println(calendar.get(Calendar.YEAR));
    }
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
}
