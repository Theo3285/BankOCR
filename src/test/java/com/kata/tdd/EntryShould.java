package com.kata.tdd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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
    public void convert_entry_one_into_number_one() {
        Entry entry = new Entry(
                "   " +
                "  |" +
                "  |");

        assertThat(entry.convert(), is(1));
    }


    @Test
    public void convert_entry_two_into_number_two() {
        Entry entry = new Entry(
                " _ " +
                " _|" +
                "|_ ");

        assertThat(entry.convert(), is(2));
    }

    @Test
    public void convert_entry_three_into_number_three() {
        Entry entry = new Entry(
                " _ " +
                " _|" +
                " _|");

        assertThat(entry.convert(), is(3));
    }


}