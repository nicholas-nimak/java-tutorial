package com.tutorial.samples.io.file.test5;

import java.io.*;
import java.util.regex.Pattern;

public class Test {
    private static final String pathToBooks = "C:\\Users\\homehp\\Desktop\\книги";

    private static void recursive(String path) {

        File file = new File(path);
        File[] list = file.listFiles();
        boolean notNull = list != null;

        Pattern pattern = Pattern.compile("wimhof\\.pdf");

        if (file.isFile() && pattern.matcher(file.getName()).matches()) {
            System.out.println(file.getAbsolutePath());
        } else if (file.isDirectory() && notNull) {
            for (File item : list) {
                recursive(item.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        recursive(pathToBooks);
    }
}
