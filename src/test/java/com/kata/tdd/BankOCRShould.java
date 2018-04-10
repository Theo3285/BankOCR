package com.kata.tdd;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BankOCRShould {

    public static final String A_DUMMY_FILE = "adummyfile.ocr";

    @Test
    public void transform_an_entry_into_an_account_number() {
        TestableBankOCR bankOCR = new TestableBankOCR();
        List<Integer> accountNumbers = bankOCR.getAccountNumbersFrom(A_DUMMY_FILE);
        assertThat(accountNumbers.get(0), is(123456789));
    }

    public class TestableBankOCR extends BankOCR {
        protected List<Entry> parseEntriesFrom(String file) {
            Entry entry = new Entry("    _  _     _  _  _  _  _ \n"
                                  + "  | _| _||_||_ |_   ||_||_|\n"
                                  + "  ||_  _|  | _||_|  ||_| _|\n"
                                  + "                           ");
            List<Entry> entries = new ArrayList<Entry>();

            entries.add(entry);

            return entries;
        }

        @Override
        protected Integer convert(Entry entry) {
            return 123456789;
        }
    }
}