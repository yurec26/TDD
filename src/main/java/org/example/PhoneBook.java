
package org.example;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public static BiMap<String, Long> names_phones = HashBiMap.create();

    public static int add(BiMap<String, Long> names_phones, String name, Long phone) {
        names_phones.put(name, phone);
        return names_phones.size();
    }

    public static String findByNumber(BiMap<String, Long> names_phones, Long phone) {
        return names_phones.inverse().get(phone);
    }

    public static Long findByName(BiMap<String, Long> names_phones, String name) {
        return names_phones.get(name);
    }

    public static String printAllNames(BiMap<String, Long> names_phones) {
        Map<String, Long> sortedMap = new TreeMap<>(names_phones);
        System.out.println(sortedMap.keySet());
        return sortedMap.keySet().toString();
    }
}
