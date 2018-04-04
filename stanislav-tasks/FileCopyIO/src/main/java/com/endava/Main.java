package com.endava;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String read = "C:\\internship\\EndavaHomework\\stanislav-tasks\\FileCopyIO\\src\\main\\resources\\dummy.txt";
        String write = "C:\\internship\\EndavaHomework\\stanislav-tasks\\FileCopyIO\\src\\main\\resources\\dummy_copy.txt";

        long initial, finish;

        initial = System.currentTimeMillis();
        CopyFile.copyFile(read, write);
        finish = System.currentTimeMillis();

        System.out.println(finish - initial);
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
