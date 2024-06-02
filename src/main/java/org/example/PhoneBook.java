package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static Map<String, Long> names_phones = new HashMap<>();
    public static int add(Map<String, Long> names_phones,String name,Long phone){
        names_phones.put(name,phone);
        return names_phones.size();
    }
}
