package com.tutorial.samples.dateTime.localeDate;

import java.time.LocalDate;
//import java.time.Period;
//import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
        System.out.println("main() started");

        try {
            System.out.println(isNominator(LocalDate.of(2018, 5, 3)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
/*
        4 ways to create LocalDate instance

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);
        LocalDate date2 = LocalDate.of(1997, 2, 1);
        System.out.println(date2);
        LocalDate date3 = LocalDate.parse("2003-05-11", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(date3);
        LocalDate date4 = LocalDate.from(date1);
        System.out.println(date4);
*/
    }

    private static boolean isNominator(LocalDate t) throws Exception {
        boolean isNominator;
        LocalDate startOfSpringSemester = LocalDate.of(LocalDate.now().getYear(), 2, 1);
        LocalDate startOfAutumnSemester = LocalDate.of(LocalDate.now().getYear(), 9, 1);

        if (t.isAfter(startOfAutumnSemester) || t.isEqual(startOfAutumnSemester)) {
            long result = startOfAutumnSemester.until(t, ChronoUnit.WEEKS);
            isNominator = result == 0 || result % 2 == 0;
        } else if (t.isAfter(startOfSpringSemester) || t.isEqual(startOfSpringSemester)) {
            long result = startOfSpringSemester.until(t, ChronoUnit.WEEKS);
            isNominator = result == 0 || result % 2 == 0;
        } else {
            throw new Exception("Neither spring nor autumn");
        }

        return isNominator;

    }

}
