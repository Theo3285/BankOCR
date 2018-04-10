package com.kata.tdd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class EntryShould {

    @Test
    public void convert_a_basic_entry() {
        Entry entry = new Entry(
                          "    _  _     _  _  _  _  _ \n"
                        + "  | _| _||_||_ |_   ||_||_|\n"
                        + "  ||_  _|  | _||_|  ||_| _|\n"
                        + "                           ");

        assertThat(entry.convert(), is(123456789));
    }

    @Test
    public void fail_when_entry_contains_illegal_cell() {
        Entry entry = new Entry(
                          " _  _  _     _  _  _  _  _ \n"
                        + "| | _| _||_||_ |_   ||_||_|\n"
                        + "|_||_  _|  | _||_|  ||_| _|\n"
                        + "                           ");

        try {
            entry.convert();
        } catch (IllegalArgumentException e){
            assertEquals(e.getMessage(), "Unknown cell with '' _ | ||_|'' value");
        }
    }
}