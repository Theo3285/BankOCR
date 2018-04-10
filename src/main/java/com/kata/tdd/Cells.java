package com.kata.tdd;

import java.util.ArrayList;
import java.util.List;

public class Cells {

    public static List<String> createFrom(String entry) {

        List<String> cells = new ArrayList<String>();

        StringBuilder cell = new StringBuilder();
        int beginIndex = 0;
        int endIndex = 3;
        for (int cellIndex = 0; cellIndex < 9; cellIndex++) {
            cell.append(entry.substring(beginIndex, endIndex));
            cell.append(entry.substring(beginIndex + 28, endIndex + 28));
            cell.append(entry.substring(beginIndex + (28 * 2), endIndex + (28 * 2)));
            cells.add(cell.toString());
            cell.setLength(0);
            beginIndex += 3;
            endIndex += 3;
        }
        return cells;

    }
}
