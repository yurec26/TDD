
package org.example;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    BiMap<String, Long> capitalCountryBiMap = HashBiMap.create();
    public static BiMap<String, Long> names_phones = HashBiMap.create();
    public static int add(BiMap<String, Long> names_phones,String name,Long phone){
        names_phones.put(name,phone);
        return names_phones.size();
    }
    public static String findByNumber(BiMap<String, Long> names_phones,Long phone){
        return names_phones.inverse().get(phone);
    }
}
