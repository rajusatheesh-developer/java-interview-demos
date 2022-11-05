package com.example.java.generics;



import java.util.*;

/**
 * What will be the output of the following program?
 *
 * The output will be {1=D, 2=C, 3=B, 4=A}.
 * The TreeMap implements the SortedMap interface, so the item elements of the existing TreeMap are sorted.
 * The order is based on the key, not the value.
 */
class TreeMap_Sort_Demo {
    public static void main(String args[]) {
      Map<Integer, String> items = new TreeMap<>();
      items.put (4, "A");
      items.put (2, "C");
      items.put (1, "D");
      items.put (3, "B");
      System.out.println (items);
    }
}