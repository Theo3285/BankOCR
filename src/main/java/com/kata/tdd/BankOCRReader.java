package com.kata.tdd;

import java.io.IOException;
import java.util.List;

public interface BankOCRReader {
    List<String> readLinesFrom(String file) throws IOException;
}
