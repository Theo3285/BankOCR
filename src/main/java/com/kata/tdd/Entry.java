package com.kata.tdd;

import java.util.List;

public class Entry {

    private String entry;

    public Entry(String entry) {
        this.entry = entry;
    }

    public int convert() {
        List<String> cells = Cells.createFrom(entry);
        String number = "";
        for (String cell : cells) {
            try {
                number += Cell.get(cell).number();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        return Integer.valueOf(number);
    }

}
