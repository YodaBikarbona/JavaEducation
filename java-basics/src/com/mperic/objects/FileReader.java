package com.mperic.objects;

import java.io.File;

public class FileReader implements Reader<File> {

    @Override
    public void read(File file) {
        System.out.println("reading file");
    }
}
