package com.kata.tdd;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CellsShould {
    @Test
    public void return_first_cell_from_entry() throws IllegalArgumentException {
        String entry = new String(
                  "    _  _     _  _  _  _  _ \n"
                        + "  | _| _||_||_ |_   ||_||_|\n"
                        + "  ||_  _|  | _||_|  ||_| _|\n"
                        + "                           ");

        List<String> cells = Cells.createFrom(entry);
        assertThat(cells.get(0), is("     |  |"));
    }

    @Test
    public void return_second_cell_from_entry() {
        String entry = new String(
                  "    _  _     _  _  _  _  _ \n"
                        + "  | _| _||_||_ |_   ||_||_|\n"
                        + "  ||_  _|  | _||_|  ||_| _|\n"
                        + "                           ");

        List<String> cells = Cells.createFrom(entry);
        assertThat(cells.get(1),
                is(" _  _||_ "));
    }

    @Test
    public void return_third_cell_from_entry() {
        String entry = new String(
                  "    _  _     _  _  _  _  _ \n"
                        + "  | _| _||_||_ |_   ||_||_|\n"
                        + "  ||_  _|  | _||_|  ||_| _|\n"
                        + "                           ");

        List<String> cells = Cells.createFrom(entry);
        assertThat(cells.get(2),
                is(" _  _| _|"));
    }

}