package com.example.java.collections;

import java.util.*;

/**
 * created by Satheesh Raju on 12-10-2022
 */
public class Enumeration_Iterator_Listiterator {
    public static void main(String[] args) {

        enumeration();
    }

    // It is for legacy collections like Stack,Vector,HashTable
    // It can used to retrieve elements
    public static void iterator() {

        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> iterator = arrayList.iterator();
        iterator.forEachRemaining(System.out::println);
    }

    // It is for legacy collections like Stack,Vector,HashTable
    // It can used to retrieve elements
    private static void enumeration() {
        Vector<Integer> integers = new Vector<>();
        Stack<Integer> stack = new Stack<>();

        integers.add(10);
        integers.add(11);
        integers.add(12);


        stack.push(13);
        stack.push(14);
        stack.push(15);

        Enumeration<Integer> enumeration = integers.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        Enumeration<Integer> enumerationStak = stack.elements();
        while (enumerationStak.hasMoreElements()) {
            System.out.println(enumerationStak.nextElement());
        }

    }
}
