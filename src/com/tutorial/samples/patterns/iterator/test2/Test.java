package com.tutorial.samples.patterns.iterator.test2;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Path path = new Path("C:\\Users\\homehp\\Desktop\\книги\\iceman.pdf");
        if (path.exists()) {
            System.out.println("path exists\n");
            System.out.println(path.searchByName(".*hof.pdf"));
        } else {
            System.out.println("path does not exist\n");
        }
    }
}

class Path extends File {
    Path(String path) {
        super(path);
    }
    private File[] siblings = this.getParentFile().listFiles();
    private List<File> listOfSiblings = Arrays.asList(siblings);
    private boolean hasNextSibling() {
        return listOfSiblings.indexOf(this) < siblings.length-1;
    }
    private Path getNextSibling() {
        return new Path(siblings[listOfSiblings.indexOf(this)+1].getAbsolutePath());
    }
    private File[] children = this.listFiles();

    private boolean matchesTo(String name) {
        Pattern pattern = Pattern.compile(name);
        return pattern.matcher(this.getName()).matches();
    }

    String searchByName(String name) {
        System.out.println(this.getName());
        if (this.isFile() && this.matchesTo(name)) {
            System.err.println(this.getName() + " matches to string: " + name + "\n");
            return this.getAbsolutePath();
        } else if (this.isDirectory() && children != null && children.length > 0) {
            return new Path(children[0].getAbsolutePath()).searchByName(name);
        }
        if (this.hasNextSibling()) {
            return this.getNextSibling().searchByName(name);
        }/* else if (this.getParentFile().getAbsolutePath().equals("C:\\Users\\homehp\\Desktop\\книги")) {
            return "null";
        }*/ else {
            System.out.println(this.getParentFile().getAbsolutePath().toUpperCase());
            
            return new Path(this.getParentFile().getAbsolutePath()).getNextSibling().searchByName(name);
        }
    }
}
