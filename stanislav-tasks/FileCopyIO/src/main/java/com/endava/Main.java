package com.endava;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    String getResourcePath(String fileName) {
        return getClass().getResource(fileName).getPath();
    }


    private void execute() {
        long initial, finish;

        initial = System.currentTimeMillis();

        CopyFile.copyFile(getResourcePath("/dummy.txt"), getResourcePath("/dummy_copy.txt"));
        finish = System.currentTimeMillis();

        System.out.println(finish - initial);
    }

    public static void main(String[] args) {

        new Main().execute();
    }
}
