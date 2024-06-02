package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class PhoneBookTest {
    public static  Map<String, Long> names_phones_Test = new HashMap<>();
    @Test
    void add_Test() {
        String name = "Biba";
        Long phone = 8_800_555_35_35L;
        //
        int expected=1;
        int actual = PhoneBook.add(names_phones_Test,name,phone);
        //
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void findByNumber() {
        Long phone = 8_800_555_35_35L;
        //
        String expected = "Biba";
        String actual = PhoneBook.findByNumber(names_phones_Test,phone);
        //
        Assertions.assertEquals(expected,actual);
    }
}