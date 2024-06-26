package org.example;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneBookTest {
    public static BiMap<String, Long> names_phones_Test = HashBiMap.create();

    @Test
    void add_Test() {
        String name = "Biba";
        Long phone = 8_800_555_35_35L;
        //
        int expected = 1;
        int actual = PhoneBook.add(names_phones_Test, name, phone);
        //
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findByNumber() {
        Long phone1 = 8_800_555_35_35L;
        //
        String expected = "Biba";
        String actual = PhoneBook.findByNumber(names_phones_Test, phone1);
        //
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findByName() {
        String name = "Biba";
        //
        Long expected = 8_800_555_35_35L;
        Long actual = PhoneBook.findByName(names_phones_Test, name);
        //
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void printAllNames() {
        String name2 = "Abobus";
        Long phone2 = 8_555_262_26_26L;
        names_phones_Test.put(name2, phone2);
        //
        String expected = "[Abobus, Biba]";
        String actual = PhoneBook.printAllNames(names_phones_Test);
        //
        Assertions.assertEquals(expected, actual);
    }
}