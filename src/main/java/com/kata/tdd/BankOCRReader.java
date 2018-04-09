package com.kata.tdd;

import java.util.List;

public class BankOCRReader {

    private String file;

    public BankOCRReader(String file) {
        this.file = file;
    }

    public List<Entry> parseEntries() {
        throw new UnsupportedOperationException();
    }

    public void open(String file) {
        throw new UnsupportedOperationException();
    }
}
