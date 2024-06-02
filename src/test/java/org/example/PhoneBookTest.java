package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class PhoneBookTest {



    @Test
    void add_Test() {
        Map<String, Long> names_phones_Test = new HashMap<>();
        String name = "Biba";
        Long phone = 8_800_555_35_35L;
        //
        int expected=1;
        int actual = PhoneBook.add(names_phones_Test);
        //
        Assertions.assertEquals(expected,actual);
    }
}