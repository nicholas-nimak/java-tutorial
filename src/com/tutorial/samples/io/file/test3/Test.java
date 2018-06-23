package com.tutorial.samples.io.file.test3;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        File path = new File("C:\\Users\\homehp\\Desktop\\книги");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }
        if (list != null) {
            for (String dirItem:list) {
                System.out.println(dirItem);
            }
        } else {
            System.out.println("list == null");
        }
    }
}

class DirFilter implements FilenameFilter {
    private String regex;
    DirFilter(String s) {
        regex = s;
    }
    public boolean accept(File path, String name) {
        return Pattern.matches(regex, name);
    }
}
