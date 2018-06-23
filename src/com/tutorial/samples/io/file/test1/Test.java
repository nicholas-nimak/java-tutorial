package com.tutorial.samples.io.file.test1;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        File path = new File("C:\\Users\\homehp\\Desktop\\книги");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }
        if (list == null) {
            System.out.print("list == null");
        } else {
            for (String item : list) {
                System.out.println(item);
            }
        }
    }
}

