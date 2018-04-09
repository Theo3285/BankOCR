package com.kata.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class ParseEntriesStoryShould {

    public static final String FILE = "scanneddocument.txt";

    @Mock
    BankOCRReader reader;

    @Test
    public void parse_an_entry() {

        Entry entry = new Entry("    _  _     _  _  _  _  _ \n"
                              + "  | _| _||_||_ |_   ||_||_|\n"
                              + "  ||_  _|  | _||_|  ||_| _|\n"
                              + "                           ");


        List<Entry> entries = new ArrayList<Entry>();
        entries.add(entry);

        given(reader.parseEntries()).willReturn(entries);

        BankOCR bankOCR = new BankOCR();
        List<Integer> accountNumbers = bankOCR.getAccountNumbersFrom(FILE);

        assertThat(accountNumbers.get(0), is(123456789));
    }
}
