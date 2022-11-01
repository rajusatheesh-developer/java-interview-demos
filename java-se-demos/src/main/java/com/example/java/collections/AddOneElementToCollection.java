package com.example.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddOneElementToCollection {

    public static void main(String[] args) throws InterruptedException {

        addOneElementToCollection();
        Thread.sleep(100000);
    }

    public static void addOneElementToCollection() {
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();

        arrayList.add("one");
        linkedList.add("one");

        System.out.println(arrayList);
        System.out.println(linkedList);


    }
}
