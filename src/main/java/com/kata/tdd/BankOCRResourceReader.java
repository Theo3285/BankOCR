package com.kata.tdd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BankOCRResourceReader implements BankOCRReader{

    public List<String> readLinesFrom(String file) throws IOException {
        List<String> lines = new ArrayList<>();
        Class clazz = BankOCRResourceReader.class;
        InputStream inputStream = clazz.getResourceAsStream("/" + file);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
}
