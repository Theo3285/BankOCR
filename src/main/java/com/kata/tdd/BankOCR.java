package com.kata.tdd;

import java.util.ArrayList;
import java.util.List;

public class BankOCR {

    //A injecter avec un framework IoC
    private BankOCRReader reader;

    public List<Integer> getAccountNumbersFrom(String file) {
        List<Entry> entries = this.parseEntriesFrom(file);
        List<Integer> accountNumbers = this.transform(entries);
        return accountNumbers;
    }

    private List<Integer> transform(List<Entry> entries) {
        List<Integer> accountNumbers = new ArrayList<Integer>();
        for (Entry entry : entries) {
            accountNumbers.add(this.convert(entry));
        }
        return accountNumbers;
    }

    protected List<Entry> parseEntriesFrom(String file) {
        reader = new BankOCRReader(file);
        return reader.parseEntries();
    }

    protected Integer convert(Entry entry) {
        return entry.convert();
    }
}
