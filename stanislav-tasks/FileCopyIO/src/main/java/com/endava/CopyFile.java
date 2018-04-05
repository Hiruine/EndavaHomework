package com.endava;

import java.io.*;

public class CopyFile {

    public static void copyFile(String sourceFileName, String destFileName) {
        try (FileInputStream fileInputStream =
                     new FileInputStream(sourceFileName);
             FileOutputStream fileOutputStream =
                     new FileOutputStream(destFileName)) {

            byte[] buff = new byte[8 * 1024];
            int numBytes;

            while ((numBytes = fileInputStream.read(buff)) != -1) {
                fileOutputStream.write(buff, 0, numBytes);
            }

        } catch (IOException e) {
            System.out.println("I/O error occurred ");
        }
    }
}
