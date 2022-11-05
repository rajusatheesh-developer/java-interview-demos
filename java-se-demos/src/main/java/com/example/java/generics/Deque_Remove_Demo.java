package com.example.java.generics;



import java.util.*;

/**
 * What will be the output of the following program?
 * The output will be
 * The following element is removed: 100.1
 * The remove(int index) method is used for removing an element of the specified index from a list.
 * It removes an element and returns the same. The first element at the head of the list is removed.
 */
class Deque_Remove_Demo {
    public static void main(String []args) {
        Deque<Double> deque = new ArrayDeque<>();
        deque.addAll(Arrays.asList(100.1, 200.1, 300.1, 400.1, 500.1));
        System.out.println("The following element is removed: " + deque.remove());
    }
}