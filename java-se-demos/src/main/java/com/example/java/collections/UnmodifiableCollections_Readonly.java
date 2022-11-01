package com.example.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * UnmodifiableCollections will throw UnsupportedOperationException
 *
 */
public class UnmodifiableCollections_Readonly {
    public static void main(String[] args) {
        List<String> modifiable= new ArrayList<>();
        modifiable.add("One");
        modifiable.add("Two");
        modifiable.add("Three");

        List<String> unmodifiable= Collections.unmodifiableList(modifiable);
        System.out.println(unmodifiable);
        unmodifiable.add("Four"); // throws UnsupportedOperationException

    }
}
