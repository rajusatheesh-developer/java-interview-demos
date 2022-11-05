package com.example.java.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_VS_Iterator_Demo {

    public static void main(String[] args) {

        removeElementWhileTraverse_ArrayList();
        removeElementWhileTraverse_Iterator();
    }

    public static void removeElementWhileTraverse_ArrayList() {
        List<String> names = new ArrayList<>();
        names.add("ONE");
        names.add("two");
        names.add("Arun");
        names.add("Kumar");

        int count=0;
        for (int i = 0; i < names.size(); ) {

            if (names.get(i).length() == 3) {
                names.remove(i);
            } else {
                ++i;
                if(count==0) {
                    names.add("NEWONE");
                    count++;
                }

            }
        }

        System.out.println(names);

    }

    public static void removeElementWhileTraverse_Iterator() {
        List<String> names = new ArrayList<>();
        names.add("ONE");
        names.add("two");
        names.add("Arun");
        names.add("Kumar");

        Iterator<String> iterator=names.iterator();
        while (iterator.hasNext())
        {
            if(iterator.next().length()==3)
            names.add("NEWONE");
        }

        System.out.println(names);

    }
}
