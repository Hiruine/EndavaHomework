package com.endava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class CSVFile implements Iterable<String>{
    final String fileName;

    public CSVFile(String fileName) {
        this.fileName = fileName;
    }

    public Iterator<String> iterator() {
        return new CSVFileIterator();
    }


    public class CSVFileIterator implements Iterator<String> {
        private BufferedReader in;
        private String nextLine;


        public CSVFileIterator() {

            try {
                in = new BufferedReader(new FileReader(fileName));
                nextLine = in.readLine();
            } catch (IOException e) {
                throw new IllegalArgumentException(e);
            }
        }

        public boolean hasNext() {
            return nextLine != null;
        }

        public String next() {
            try {
                String result = nextLine;

                if (nextLine != null) {
                    nextLine = in.readLine();
                    if (nextLine == null)
                        in.close();
                }

                return result;
            } catch(IOException e) {
                throw new IllegalArgumentException(e);
            }
        }


    }


}

