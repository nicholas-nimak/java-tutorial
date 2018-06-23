package com.tutorial.samples.io.file.test9;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("test9 started");
        search(".*мозг.*", "C:\\Users\\homehp\\Desktop\\книги");
        printMatches();
    }
    static private void printMatches() {
        for (File item : listOfMatches) {
            System.out.println(item.getAbsolutePath());
        }
    }
    static private ArrayList<File> listOfMatches = new ArrayList<>();

//***    checks only files
//    static private void search(String regex, String path) {
//        File file = new File(path);
//        if (file.exists()) {
//            Pattern pattern = Pattern.compile(regex);
//            if (file.isDirectory()) {
//                File[] list = file.listFiles();
//                if (list != null && list.length > 0) {
//                    for (File item : list) {
//                        search(regex, item.getAbsolutePath());
//                    }
//                }
//            } else if (pattern.matcher(file.getName()).matches()) {
//                listOfMatches.add(file);
//            }
//        }
//    }

//***    checks files and directories
    static private void search(String regex, String path) {
        File file = new File(path);
        if (file.exists()) {
            Pattern pattern = Pattern.compile(regex);
            if (pattern.matcher(file.getName()).matches()) {
                listOfMatches.add(file);
            }
            if (file.isDirectory()) {
                File[] list = file.listFiles();
                if (list != null && list.length > 0) {
                    for (File item : list) {
                        search(regex, item.getAbsolutePath());
                    }
                }
            }
        }
    }
}
