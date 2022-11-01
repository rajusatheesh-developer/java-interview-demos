package com.example.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;


/**
 * FailFast Collections will throw an ConcurrentModificationException
 *
 */
public class FailFastIteratorDemo {

    private static HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) {

        for (int i = 0; i < 10_000; i++) {
            map.put("Key" + i, "Value" + i);
        }

        Iterator<String> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            map.put(UUID.randomUUID().toString(), UUID.randomUUID().toString());
        }
    }

}
