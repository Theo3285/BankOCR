package com.kata.tdd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EntryShould {

    @Test
    public void split_the_entry_into_nine_cells() {
        Entry entry = new Entry(
                "   " +
                "  |" +
                "  |");

        Integer cell = entry.convert();

        assertThat(cell, is(1));
    }
}