package com.tutorial.samples.io.file.test2;

public class Test {
    public static void main(String[] args) {
        System.out.println("main(); start");

        String[] list;
        Path path = new Path("C:\\Users\\homehp\\Desktop\\книги");

        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }

        if (list == null) {
            System.out.print("list == null");
        } else {
            for (String dirItem : list) {
                System.out.println(dirItem);
            }
        }

        System.out.println("main(); end");
    }
}
