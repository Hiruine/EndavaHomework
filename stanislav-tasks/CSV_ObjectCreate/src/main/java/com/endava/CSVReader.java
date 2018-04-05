package com.endava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CSVReader {
    public static void readStudentsFromSCV(String fileName) {
        for (String line: new CSVFile(fileName)) {
            Pattern pattern = Pattern.compile(",");
            String[] tokens = pattern.split(line);

            Student student = createStudent(tokens);
        }
    }

    private static Student createStudent(String[] metadata) {
        System.out.println(metadata[0] + "\t" + metadata[1] + "\t" + metadata[2]);
        return new Student(metadata[0], metadata[1], metadata[2]);
    }
}
