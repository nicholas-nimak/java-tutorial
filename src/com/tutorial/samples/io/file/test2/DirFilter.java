package com.tutorial.samples.io.file.test2;

import java.io.*;
import java.util.regex.*;

public class DirFilter implements FilenameFilter {
    private Pattern pattern;
    DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
