package com.tutorial.samples.patterns.iterator.test4;

import java.io.File;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\homehp\\Desktop\\книги");
        if (file.exists()) {
            File[] arrayOfFiles = file.listFiles();
            List<File> files;
            if (arrayOfFiles != null) files = Arrays.asList(arrayOfFiles);
            else files = new ArrayList<>();
            Iterator iterator = files.iterator();

            Object next = iterator.next();
            System.out.println(next);


        } else {
            System.out.println("file does not exist");
        }
    }
}
