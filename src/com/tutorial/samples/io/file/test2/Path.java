package com.tutorial.samples.io.file.test2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Path extends File {
    Path(String pathname) {
        super(pathname);
    }
    public String[] list(FilenameFilter filter) {
        String names[] = list();
        if ((names == null) || (filter == null)) {
            return names;
        }
        List<String> v = new ArrayList<>();
        for (String name : names) {
            if (filter.accept(this, name)) {
                v.add(name);
            }
        }
        return v.toArray(new String[v.size()]);
    }
}
