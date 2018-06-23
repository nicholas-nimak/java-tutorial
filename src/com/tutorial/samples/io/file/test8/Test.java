package com.tutorial.samples.io.file.test8;

import java.io.File;
import java.util.regex.Pattern;

public class Test {
    private static String search() {
        File file = new File("C:\\Users\\homehp\\Desktop\\книги");
        File[] list = file.listFiles();

        Pattern pattern = Pattern.compile("wimhof\\.pdf");

        for (File item : list) {
            if (item.isFile() && pattern.matcher(item.getName()).matches()) {
                return item.getAbsolutePath();
            }
        }
        return "--";
    }
    public static void main(String[] args) {
        System.out.println(search());
    }
}
