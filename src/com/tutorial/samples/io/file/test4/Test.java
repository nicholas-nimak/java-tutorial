package com.tutorial.samples.io.file.test4;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        if (args.length == 1 || args.length == 2) {
            File path = new File(args[0]);
            String[] list = path.list();
            if (list != null && args.length == 2) {
                ArrayList<String> matchesList = new ArrayList<>();
                Pattern p = Pattern.compile(args[1]);
                for (String item : list) {
                    if (p.matcher(item).matches()) {
                        matchesList.add(item);
                    }
                }
                list = matchesList.toArray(new String[0]);
            } else {
                System.out.println("list == null || args.length != 2");
            }
            if (list != null) {
                for (String item : list) {
                    System.out.println(item);
                }
            } else {
                System.out.println("list == null");
            }
        } else {
            System.out.println("args.length != 1 && args.length != 2");
        }
    }
}
