package com.endava;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    private void execute() {
        long initial, finish;

        initial = System.currentTimeMillis();

        CopyFile.copyFile(getClass().getResource("/dummy.txt").getPath(), getClass().getResource("/dummy_copy.txt").getPath());
        finish = System.currentTimeMillis();

        System.out.println(finish - initial);
    }

    public static void main(String[] args) {

        new Main().execute();
    }


//    private static void copyFile(File source, File dest) throws IOException {
//
//
//        InputStream inputStream;
//        OutputStream outputStream;
//
//        inputStream = new BufferedInputStream(new FileInputStream(source));
//        outputStream = new BufferedOutputStream(new FileOutputStream(dest));
//
//        byte[] buffer = new byte[1024];
//
//        int length;
//
//        while ((length = inputStream.read(buffer)) > 0) {
//            outputStream.write(buffer, 0, length);
//        }
//
//        inputStream.close();
//        outputStream.close();
//    }
}
