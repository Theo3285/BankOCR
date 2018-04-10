package com.kata.tdd;

import java.util.ArrayList;
import java.util.List;

public class Entry {

    private String entry;

    public Entry(String entry) {
        this.entry = entry;
    }

    public int convert() {

        String number = "";
        try {
            number = Cell.get(entry).number();
        } catch (UnsupportedCellValueException e) {
            e.printStackTrace();
        }
        return Integer.valueOf(number);
    }

    public int convertAFullEntry() {
        List<String> cells = Cells.createFrom(entry);
        String number = "";
        for (String cell : cells) {
            try {
                number += Cell.get(cell).number();
            } catch (UnsupportedCellValueException e) {
                e.printStackTrace();
            }
        }
        return Integer.valueOf(number);
    }

}
