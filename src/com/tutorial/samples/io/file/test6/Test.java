package com.tutorial.samples.io.file.test6;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\homehp\\Desktop\\книги\\wimhof.pdf");
        String[] list = file.list();
        System.out.println(list.length); // NullPointerException
    }
}
